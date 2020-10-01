package com.desafio;

public class Application {

    public static void main(String[] args) {
        Integer [] arr = new Integer[5];

        ArrayDobro a = new ArrayDobro(arr);
        ArrayMetade b = new ArrayMetade(arr);
        ArrayNoAccept c = new ArrayNoAccept(arr);

        arr = a.adicionarElemento(1);
        arr = a.adicionarElemento(2);
        arr = a.adicionarElemento(3);
        arr = a.adicionarElemento(4);
        arr = a.adicionarElemento(5);
        arr = a.adicionarElemento(6);

        for (int i=0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        arr = a.remover(4);
        arr = a.remover(2);

        for (int i=0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println(a.recuperarElemento(1));

    }

}
