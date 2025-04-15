package listaCircular;

public class NoCircular<T> {

    private T conteudo;
    private NoCircular<T> proxNo;

    public NoCircular(T conteudo) {
        this.conteudo = conteudo;
        this.proxNo = null;
    }

    public NoCircular() {
        this.proxNo = null;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoCircular<T> getProxNo() {
        return proxNo;
    }

    public void setProxNo(NoCircular<T> proxNo) {
        this.proxNo = proxNo;
    }
}
