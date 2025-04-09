package listaEncadeada;

public class lista<T> {

    No<T> referenciaEntrada;

    public lista() {
        this.referenciaEntrada = null;
    }

    public int size(){
        int tamanhoLista = 0;
        No<T> refAux = referenciaEntrada;
        while (true){
            if(refAux != null){
                tamanhoLista++;
                if(refAux.getProximoNo() != null){
                    refAux = refAux.getProximoNo();
                } else {
                    break;
                }
            } else {
                break;
            }
        }

        return  tamanhoLista;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo,null);

        if(this.isEmpty()){
            referenciaEntrada = novoNo;
            return;
        }
            No<T> auxNo = referenciaEntrada;

        for (int i = 0; i < this.size() - 1; i++) {
            auxNo = auxNo.getProximoNo();
        }
            auxNo.setProximoNo(novoNo);

    }

    private No<T> getNo(int index){

        validarIndice(index);
        No<T> auxNo = referenciaEntrada;
        No<T> noRet = null;

        for (int i = 0; i <= index; i++) {
            noRet = auxNo;
            auxNo = auxNo.getProximoNo();
        }

        return noRet;
    }

    public T get(int index){
        No <T> AuxNo = this.getNo(index);
        return AuxNo.getConteudo();
    }

    public T remove(int index) {
        T valor;
        No<T> noPivor = this.getNo(index);

        if( index == 0) {
            referenciaEntrada = noPivor.getProximoNo();
            return noPivor.getConteudo();
        }
        No<T> noAnterior = this.getNo(index - 1);
        noAnterior.setProximoNo(noPivor.getProximoNo());
        return noPivor.getConteudo();
    }
    public String toString() {
        String StrRetorno = "lista";
        No<T> auxNo = referenciaEntrada;

        for (int i = 0; i < this.size(); i++) {
            StrRetorno += "No{conteudo=" + auxNo.getConteudo() + "}] --> ";
            auxNo = auxNo.getProximoNo();
        }
        StrRetorno += "null";
        return StrRetorno;

    }

    private void validarIndice(int index) {
        int tam = this.size();
        if (index >= tam) {
            throw new IndexOutOfBoundsException("Não existe conteudo no índice: " + index + "desta lista. Ultimo indice será: " + (tam - 1) + "\n");
        }
    }

    public boolean isEmpty(){
        return referenciaEntrada == null ? true : false;
    }
}
