package ArvoreBinaria;

public class arvore < T extends Comparable<T>>{

    private noBin<T> raiz;

    public arvore(){
        this.raiz = null;
    }

    public void inserir(T conteudo){
        noBin<T> novoNo = new noBin<>(conteudo);
        raiz = inserir(raiz, novoNo);
    }

    private noBin<T> inserir(noBin<T> atual, noBin<T> novoNo) {
        if (atual == null) {
            return novoNo;
        } else if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) {
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
        } else {
            atual.setNoDir(inserir(atual.getNoDir(), novoNo));
        }
        return atual;
    }

    private void remove(T conteudo){
        try{
            noBin<T> atual = this.raiz;
            noBin<T> pai = null;
            noBin<T> filho = null;
            noBin<T> temp = null;

            // Estou procurando o no que contem o valor T em conteudo, apos encontra o valor armazena no atual.
            while (atual != null && !atual.getConteudo().equals(conteudo)){
                pai = atual;
                if (conteudo.compareTo(atual.getConteudo()) < 0) {
                    atual = atual.getNoEsq();
                } else {
                    atual = atual.getNoDir();
                }
            }

            // caso nao encontre, ele sairá do while e será um valor null.
            if (atual == null) {
                System.out.println("Conteudo não encontrado. Bloco Try");
            }

            // Proximo passo seria apagar o no e restruturá a ordem da arvore.
            if (pai == null) {
                if (atual.getNoDir() == null) {
                    this.raiz = atual.getNoEsq();
                } else if (atual.getNoEsq() == null){
                    this.raiz = atual.getNoDir();
                } else {
                    for (temp = atual, filho = atual.getNoEsq();
                        filho.getNoDir() != null;
                        temp = filho, filho = filho.getNoEsq()
                    ) {
                        if (filho != atual.getNoEsq()) {
                            temp.setNoDir(filho.getNoEsq());
                            temp.setNoEsq(raiz.getNoEsq());
                        }
                    }
                    filho.setNoDir(raiz.getNoDir());
                    raiz = filho;
                }
            } else if (atual.getNoDir() == null) {

                if(pai.getNoEsq() == atual){
                    pai.setNoEsq(atual.getNoEsq());
                } else {
                    pai.setNoDir(atual.getNoEsq());
                }

            } else if (atual.getNoEsq() == null) {

                if(pai.getNoEsq() == atual){
                    pai.setNoEsq(atual.getNoDir());
                } else {
                    pai.setNoDir(atual.getNoDir());
                }

            } else {
                for (
                        temp = atual, filho = atual.getNoEsq();
                        filho.getNoDir() != null;
                        temp = filho, filho = filho.getNoDir()
                ){
                    if(filho != atual.getNoEsq()){
                        temp.setNoDir(filho.getNoEsq());
                        filho.setNoEsq(atual.getNoEsq());
                    }
                    filho.setNoDir(atual.getNoDir());
                    if(pai.getNoEsq() == atual){
                        pai.setNoEsq(filho);
                    } else {
                        pai.setNoDir(filho);
                    }
                }
            }


        } catch (NullPointerException erro) {
            System.out.println("Conteudo não encontrado. Bloco Catch");
        }
    }

    public void exibirInOrdem(){
        System.out.print("\n Exibindo inOrdem");
        exibirInOrdem(this.raiz);
    }

    public void exibirposOrdem(){
        System.out.print("\n Exibindo posOrdem");
        exibirposOrdem(this.raiz);
    }

    public void exibirpreOrdem(){
        System.out.print("\n Exibindo preOrdem");
        exibirpreOrdem(this.raiz);
    }

    private void exibirInOrdem(noBin<T> atual){
        if (atual != null) {
            exibirInOrdem(atual.getNoEsq());
            System.out.print("( " + atual.getConteudo() + " ), ");
            exibirInOrdem(atual.getNoDir());
        }
    }

    private void exibirposOrdem(noBin<T> atual){
        if (atual != null) {
            exibirposOrdem(atual.getNoEsq());
            exibirposOrdem(atual.getNoDir());
            System.out.print("( " + atual.getConteudo() + " ), ");
        }
    }

    private void exibirpreOrdem(noBin<T> atual){
        if (atual != null) {
            System.out.print("( " + atual.getConteudo() + " ), ");
            exibirpreOrdem(atual.getNoEsq());
            exibirpreOrdem(atual.getNoDir());
        }
    }



}
