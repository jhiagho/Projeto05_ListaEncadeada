package listaCircular;

public class ListaCircular<T> {

    private NoCircular<T> cabeca;
    private NoCircular<T> cauda;
    private int tamanholista;

    public ListaCircular() {
        this.cauda = null;
        this.cabeca = null;
        this.tamanholista = 0;
    }

    public void add(T conteudo){
        NoCircular<T> novoNo = new NoCircular<>(conteudo);
        if (this.tamanholista == 0) {
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setProxNo(this.cauda);
        }else{
            novoNo.setProxNo(this.cauda);
            this.cabeca.setProxNo(novoNo);
            this.cauda = novoNo;
        }
        tamanholista++;

    }

    public void remove(int index) {
        if(index >= this.tamanholista) {
            throw new IndexOutOfBoundsException("O indece e maior que o tamanho da lista");
        }
        NoCircular<T> noAux = cauda;

        if(index == 0){
            this.cauda = this.cauda.getProxNo();
            this.cabeca.setProxNo(this.cauda);
        } else if(index == 1){
            this.cauda.setProxNo(this.cauda.getProxNo().getProxNo());
        } else {
            for (int i = 0; i < index-1; i++) {
                noAux = noAux.getProxNo();
            }
            noAux.setProxNo(noAux.getProxNo().getProxNo());
        }
        tamanholista--;
    }

    public String toString(){
        String retorno = "LISTA CIRCULAR: ";
        NoCircular<T> noAux = cauda;
        for (int i = 0; i < this.size(); i++) {
            retorno += "[No{" + noAux.getConteudo() + "}] -->";
            noAux = noAux.getProxNo();
        }
        return retorno += this.size() != 0 ? "(Retorna ao início)" : "[]";
    }


    private NoCircular<T> getNO(int index){
        if(this.isEmpty()) throw  new IndexOutOfBoundsException("A lista está vazia");
        if(index == 0) return this.cauda;

        NoCircular<T> noAux = this.cauda;
        for (int i = 0; (i < index) && (noAux != null); i++) {
            noAux = noAux.getProxNo();
        }
        return noAux;
    }

    public T get(int index){
        return this.getNO(index).getConteudo();
    }

    public boolean isEmpty(){
        return this.tamanholista == 0 ? true : false;
    }

    public int size(){
        return this.tamanholista;
    }



}
