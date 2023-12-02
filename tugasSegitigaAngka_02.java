import java.util.Scanner;

public class tugasSegitigaAngka_02 {
    public static void main(String[] args) {
        Scanner sc02 = new Scanner(System.in);

        System.out.print("Masukkan nilai (minimal 3): ");
        int N = sc02.nextInt();

        if (N < 3) {
            System.out.println("Nilai harus minimal 3");
            return;
        }

        for (int i = 1; i <= N; i++) {
            for (int j = N; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
