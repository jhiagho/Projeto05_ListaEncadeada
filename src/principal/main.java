package principal;

import listaEncadeada.lista;
import listaDuplamenteEncadeada.ListaDupla;

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

        //listaDuplamente
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

    }




}
