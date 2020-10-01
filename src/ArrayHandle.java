public class ArrayHandle {

    public static int [] dobrar(int size, int [] array) {
        int dobro = size * 2;
        int [] aux = new int[dobro];

        System.arraycopy(array, 0, aux, 0, size);

        return aux;
    }

    public static int [] aumentarPelaMetade(int size, int [] array) {
        int metade = size / 2;
        int [] aux = new int[size + metade];

        System.arraycopy(array, 0, aux, 0, size);

        return aux;
    }

    public static void nãoPermitir() {
        System.out.println("Limite do Array atingido...\nNão é possivel aumenta-lo!");
    }

}
