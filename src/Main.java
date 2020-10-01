public class Main {
    public static void main(String[] args) {
        int [] array = new int[5];
        array[0] = 2;
        array[1] = 2;
        array = adicionarElemento(3, array);
        array = adicionarElemento(5, array);
        array = adicionarElemento(6, array);
        array = adicionarElemento(7, array);
        array = adicionarElemento(8, array);
        array = adicionarElemento(9, array);

        for (int i=0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.print("\n");

        array = removerElemento(3, array);
        array = removerElemento(4, array);

        for (int i=0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.print("\n");

        System.out.print(recuperarElemento(3, array));

    }

    public static int[] adicionarElemento(int elemento, int [] array) {
        if (array[array.length-1] != 0) {
            array = ArrayHandle.aumentarPelaMetade(array.length, array);
        }
        for (int i=0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = elemento;
                break;
            }
        }
        return array;
    }

    public static int[] removerElemento(int index, int [] array) {
        if (index < array.length) {
            array[index] = 0;
            for (int i=index; i < array.length-1; i++) {
                array[i] = array[i+1];
            }
            array[array.length-1] = 0;
        }

        return array;
    }

    public static int recuperarElemento(int index, int [] array) {
        return array[index];
    }

}
