package exercises;

public class EX5 {
    public static void main(String[] args) {

        String[] array1 = {"Morango", "Banana", "Maçã", "Uva", "Caqui"};
        String[] array2 = {"Manga", "Caqui", "Morango", "Amora"};

        encontrarEImprimirElementosComuns(array1, array2);

        Integer[] numeros1 = {1, 2, 3, 4, 5};
        Integer[] numeros2 = {4, 5, 6, 7, 8};

        encontrarEImprimirElementosComuns(numeros1, numeros2);
    }

    static void encontrarEImprimirElementosComuns(Object[] array1, Object[] array2) {
        System.out.print("Elementos comuns: ");

        for (Object elemento1 : array1) {
            for (Object elemento2 : array2) {
                if (elemento1.equals(elemento2)) {
                    System.out.print(elemento1 + ", ");
                }
            }
        }
    }
}
