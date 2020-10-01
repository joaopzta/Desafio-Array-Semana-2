package com.desafio;

public class ArrayMetade extends ArrayAbs {

    public ArrayMetade(Integer[] array) {
        super(array);
    }

    @Override
    protected Integer[] adicionarElemento(Integer elemento) {
        if (this.array[this.size-1] != null) {
            this.array = aumentarMetade();
        }
        for (int i=0; i < this.array.length; i++) {
            if (this.array[i] == null) {
                this.array[i] = elemento;
                break;
            }
        }
        return this.array;
    }

    private Integer[] aumentarMetade() {
        Integer metade = this.size / 2;
        Integer [] aux = new Integer[this.size + metade];

        System.arraycopy(this.array, 0, aux, 0, this.size);
        this.size += metade;
        return aux;
    }

}
