import java.util.Scanner;

public class DeretDescendingRekursif_02 {

    static void deretDescendingRekursif(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            deretDescendingRekursif(n - 1);
        }
    }

    static void deretDescendingIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc02 = new Scanner(System.in);

        System.out.print("Masukkan nilai : ");
        int n = sc02.nextInt();

        System.out.println("Deret descending rekursif:");
        deretDescendingRekursif(n);
        System.out.println(); 

        System.out.println("Deret descending iteratif:");
        deretDescendingIteratif(n);
    }
}
