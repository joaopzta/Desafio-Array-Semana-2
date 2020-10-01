package com.desafio;

public class ArrayNoAccept extends ArrayAbs {

    public ArrayNoAccept(Integer[] array) {
        super(array);
    }

    @Override
    protected Integer[] adicionarElemento(Integer elemento) {
        if (this.array[this.size-1] != null) {
            try {
                noAccept();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        for (int i=0; i < this.array.length; i++) {
            if (this.array[i] == null) {
                this.array[i] = elemento;
                break;
            }
        }
        return this.array;
    }

    private void noAccept()  {
        System.out.println("Array CHEIO!!! Não é possivel adicionar mais elementos.");
    }


}
