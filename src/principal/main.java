package principal;

import listaEncadeada.lista;
import listaDuplamenteEncadeada.ListaDupla;
import listaCircular.ListaCircular;

public class main {

    public static void main(String[] args){

        //listaEncadeada
        System.out.println("------ LISTA SIMPLEMENTE ENCADEADA ------ \n");
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

        //listaDuplamente
        System.out.println("\n ------ LISTA DUPLAMENTE ENCADEADA ------ \n");
        ListaDupla<String> minhalista2 = new ListaDupla<String>();

        minhalista2.add("teste3");
        minhalista2.add("teste6");
        minhalista2.add("teste9");
        minhalista2.add("teste12");
        minhalista2.add("teste15");

       System.out.println(minhalista2.get(0));
       System.out.println(minhalista2.get(4));
       System.out.println(minhalista2.toString());

       minhalista2.remove(4);
       System.out.println(minhalista2.size());
       System.out.println(minhalista2.toString());

        minhalista2.remove(1);
        System.out.println(minhalista2.size());
        System.out.println(minhalista2.toString());

        System.out.println("\n ------ LISTA CIRCULAR ------ \n");
        ListaCircular<String> minhalista3 = new ListaCircular<String>();

        minhalista3.add("c0");
        minhalista3.add("c1");
        minhalista3.add("c2");
        minhalista3.add("c3");
        minhalista3.add("c4");
        System.out.println(minhalista3.toString());
        System.out.println(minhalista3.get(0));
        minhalista3.remove(0);
        System.out.println(minhalista3.toString());
        System.out.println(minhalista3.get(1));
        minhalista3.remove(1);
        System.out.println(minhalista3.toString());
        System.out.println(minhalista3.get(2));
        minhalista3.remove(2);
        System.out.println(minhalista3.toString());



    }




}
