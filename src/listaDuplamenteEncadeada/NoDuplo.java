package listaDuplamenteEncadeada;

public class NoDuplo<T> {

    private T conteudo;
    private NoDuplo<T> proximoNoDuplo;
    private NoDuplo<T> anteriorNoDuplo;

    public NoDuplo(T conteudo, NoDuplo proximoNoDuplo, NoDuplo anteriorNoDuplo) {
        this.conteudo = conteudo;
        this.proximoNoDuplo = proximoNoDuplo;
        this.anteriorNoDuplo = anteriorNoDuplo;
    }
    public NoDuplo() {
        this.proximoNoDuplo = null;
        this.anteriorNoDuplo = null;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoDuplo getProximoNo() {
        return proximoNoDuplo;
    }

    public void setProximoNo(NoDuplo<T> proximoNoDuplo) {
        this.proximoNoDuplo = proximoNoDuplo;
    }

    public NoDuplo getAnteriorNo() {
        return anteriorNoDuplo;
    }

    public void setAnteriorNo(NoDuplo<T> anteriorNoDuplo) {
        this.anteriorNoDuplo = anteriorNoDuplo;
    }
}
