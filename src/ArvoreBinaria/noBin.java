package ArvoreBinaria;

public class noBin<T extends Comparable<T> > {

    private T conteudo;
    private noBin<T> noEsq;
    private noBin<T> noDir;

    public noBin(T conteudo){
        this.conteudo = conteudo;
        noDir = noEsq = null;
    }

    public noBin(){
        noDir = noEsq = null;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public noBin<T> getNoEsq() {
        return noEsq;
    }

    public void setNoEsq(noBin<T> noEsq) {
        this.noEsq = noEsq;
    }

    public noBin<T> getNoDir() {
        return noDir;
    }

    public void setNoDir(noBin<T> noDir) {
        this.noDir = noDir;
    }
}
