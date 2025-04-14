public class BilanganGanjil {
    public static void main(String[] args) {

        System.out.println("Bilangan ganjil dari 1 hingga 20 (dengan for loop):");
        for (int i = 1; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        System.out.println("Bilangan ganjil dari 1 hingga 20 (dengan while loop):");
        int j = 1;
        while (j <= 20) {
            System.out.print(j + " ");
            j += 2;
        }
        System.out.println("\n");

        System.out.println("Bilangan ganjil dari 1 hingga 20 (dengan do-while loop):");
        int k = 1;
        do {
            System.out.print(k + " ");
            k += 2;
        } while (k <= 20);
        System.out.println();
    }
}
