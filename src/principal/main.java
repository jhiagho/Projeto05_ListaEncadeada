package principal;

import listaEncadeada.lista;

public class main {

    public static void main(String[] args){

        //listaEncadeada
        lista<String> minhalista = new lista<String>();

        minhalista.add("teste1");
        minhalista.add("teste2");
        minhalista.add("teste3");
        minhalista.add("teste4");

        System.out.println(minhalista.get(0));
        System.out.println(minhalista.get(1));
        System.out.println(minhalista.get(2));
        System.out.println(minhalista.get(3));

        System.out.println(minhalista.toString());
        System.out.println(minhalista.remove(3));
        System.out.println(minhalista.toString());
    }




}
