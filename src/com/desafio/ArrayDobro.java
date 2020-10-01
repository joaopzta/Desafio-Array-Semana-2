package com.desafio;

public class ArrayDobro extends ArrayAbs {

    public ArrayDobro(Integer[] array) {
        super(array);
    }

    @Override
    protected Integer[] adicionarElemento(Integer elemento) {
        if (this.array[this.size-1] != null) {
            this.array = dobrar();
        }
        for (int i=0; i < this.array.length; i++) {
            if (this.array[i] == null) {
                this.array[i] = elemento;
                break;
            }
        }
        return this.array;
    }

    private Integer[] dobrar() {
        Integer dobro = this.size * 2;
        Integer [] aux = new Integer[dobro];

        System.arraycopy(this.array, 0, aux, 0, this.size);
        this.size = dobro;
        return aux;
    }
}
