import java.util.Scanner;

public class tugasAgung02 {
    public static void main(String[] args) {
        Scanner scanner02 = new Scanner(System.in);

        System.out.print("Masukkan banyaknya elemen array: ");
        int n = scanner02.nextInt();

        int[] arrayInt = new int[n];
        System.out.println("Masukkan elemen-elemen array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + i + ": ");
            arrayInt[i] = scanner02.nextInt();
        }

        int nilaiTertinggi = arrayInt[0];
        int nilaiTerendah = arrayInt[0];
        int totalNilai = arrayInt[0];

        for (int i = 1; i < n; i++) {
            if (arrayInt[i] > nilaiTertinggi) {
                nilaiTertinggi = arrayInt[i];
            }

            if (arrayInt[i] < nilaiTerendah) {
                nilaiTerendah = arrayInt[i];
            }

            totalNilai += arrayInt[i];
        }

        double rataRata = (double) totalNilai / n;

        System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai Terendah: " + nilaiTerendah);
        System.out.println("Rata-rata Nilai: " + rataRata);
    }
}
