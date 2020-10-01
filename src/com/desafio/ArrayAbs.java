package com.desafio;

public abstract class ArrayAbs {

    protected Integer size;
    protected Integer [] array;

    public ArrayAbs (Integer [] array) {
        this.size = array.length;
        this.array = array;
    }

    protected abstract Integer [] adicionarElemento(Integer elemento) throws Exception;

    public Integer [] remover(int index) {
        if (index < this.size) {
            this.array[index] = 0;
            for (int i=index; i < this.size-1; i++) {
                this.array[i] = this.array[i+1];
            }
            this.array[this.size-1] = null;
        }

        return array;
    }

    public Integer recuperarElemento(Integer index) {
        if (index < this.size) {
            return array[index];
        }

        return -1;
    }

}

//    public static int [] dobrar(int size, int [] array) {
//        int dobro = size * 2;
//        int [] aux = new int[dobro];
//
//        System.arraycopy(array, 0, aux, 0, size);
//
//        return aux;
//    }
//
//    public static int [] aumentarPelaMetade(int size, int [] array) {
//        int metade = size / 2;
//        int [] aux = new int[size + metade];
//
//        System.arraycopy(array, 0, aux, 0, size);
//
//        return aux;
//    }
//
//    public static void nãoPermitir() {
//        System.out.println("Limite do Array atingido...\nNão é possivel aumenta-lo!");
//    }
