package listaDuplamenteEncadeada;

public class ListaDupla<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista;

    public ListaDupla() {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    private NoDuplo<T> getNo(int index){
        if(index > tamanhoLista-1){
            throw new IndexOutOfBoundsException("Não existe conteudo no índice: " + index + "desta lista. Ultimo indice será: " + (tamanhoLista - 1) + "\n");
        }

        NoDuplo<T> noAuxiliar = primeiroNo;

        for (int i = 0; (i < index) && (noAuxiliar != null); i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noAuxiliar;
    }

    public T get (int index){
        return this.getNo(index).getConteudo();
    }

    public void add(T elemento){
        NoDuplo<T> novoNo = new NoDuplo<>(elemento,null,null);
        novoNo.setAnteriorNo(ultimoNo);

        if(primeiroNo == null) {
            primeiroNo = novoNo;
        } if (ultimoNo != null) {
            ultimoNo.setProximoNo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;
    }

    public void add(int index, T elemento){
        NoDuplo<T> novoNo = new NoDuplo<>(elemento,null,null);
        NoDuplo<T> AuxNo = getNo(index);
        novoNo.setProximoNo(AuxNo);

        if(novoNo.getProximoNo() != null){
            novoNo.setAnteriorNo(AuxNo.getAnteriorNo());
            novoNo.getProximoNo().setAnteriorNo(novoNo);
        } else {
            novoNo.setAnteriorNo(ultimoNo);
            ultimoNo = novoNo;
        }

        if(index == 0){
            primeiroNo = novoNo;
        } else {
            novoNo.getAnteriorNo().setProximoNo(novoNo);
        }

        tamanhoLista++;
    }

    public void remove(int index) {
        if(index == 0){
            primeiroNo = primeiroNo.getProximoNo();
            if(primeiroNo != null) {
                primeiroNo.setAnteriorNo(null);
            }
        } else {
            NoDuplo<T> noAuxiliar = getNo(index);
            noAuxiliar.getAnteriorNo().setProximoNo(noAuxiliar.getProximoNo());
            if (noAuxiliar != ultimoNo) {
                noAuxiliar.getProximoNo().setAnteriorNo(noAuxiliar.getAnteriorNo());
            } else {
                ultimoNo = noAuxiliar;
            }
        }
        this.tamanhoLista--;
    }
    public String toString(){
        String retorno = "ListaEncadeada: ";

        NoDuplo<T> noAux = primeiroNo;
        for (int i = 0; i < this.size(); i++) {
            retorno += "[No = " + noAux.getConteudo() + "] -->";
            noAux = noAux.getProximoNo();
        }
        retorno += "null";
        return retorno;
    }

    public int size(){
        return tamanhoLista;
    }
}
