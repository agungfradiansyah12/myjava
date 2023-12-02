import java.util.Scanner;

public class NilaiMahasiswa_02 {
    static Scanner sc02 = new Scanner(System.in);
    static String[] namaMahasiswa = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};
    static double[][] nilaiMahasiswa = new double[5][7];

    // Fungsi untuk meninputkan data nilai mahasiswa
    static void inputNilai() {
        for (int i = 0; i < 5; i++) {
            System.out.println("\nMasukkan nilai " + namaMahasiswa[i]);
            for (int j = 0; j < 7; j++) {
                System.out.print("Minggu ke-" + (j + 1) + " : ");
                nilaiMahasiswa[i][j] = sc02.nextDouble();
            }
        }
    }

    // Fungsi untuk menampilkan seluruh nilai mahasiswa mulai dari minggu pertama sampai ketujuh
    static void datanilaiMahasiswa() {
        System.out.println("Nilai tugas kelima mahasiswa dari minggu 1 hingga 7 berturut-turut :");
        for (int i = 0; i < 5; i++) {
            System.out.print("Mahasiswa " + namaMahasiswa[i] + "\t: ");
            for (int j = 0; j < 7; j++) {
                System.out.print(nilaiMahasiswa[i][j] + ", ");
            }
            System.out.println();
        }
    }

    // Fungsi untuk mencari pada hari keberapakah terdapat nilai tertinggi dibanding hari lain dari keseluruhan mahasiswa
    static int mingguTertinggi() {
        double nilaiTertinggi = 0;
        int MingguTertinggi = 0;

        for (int j = 0; j < 7; j++) {
            double totalNilaiMinggu = 0;
            for (int i = 0; i < 5; i++) {
                totalNilaiMinggu += nilaiMahasiswa[i][j];
            }
            if (totalNilaiMinggu > nilaiTertinggi) {
                nilaiTertinggi = totalNilaiMinggu;
                MingguTertinggi = j;
            }
        }
        return MingguTertinggi;
    }

    public static void main(String[] args) {
        inputNilai();
        System.out.println();
        datanilaiMahasiswa();
        printNilaiTertinggiMahasiswa();
    }

    // Fungsi untuk menampilkan mahasiswa yang memiliki nilai tertinggi (tampilkan pula keterangan nilai dari minggu ke-)
    static void printNilaiTertinggiMahasiswa() {
        double nilaiTertinggi = 0;
        int Mahasiswa = 0;
        int Minggu = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                if (nilaiMahasiswa[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMahasiswa[i][j];
                    Mahasiswa = i;
                    Minggu = j;
                }
            }
        }
        System.out.println("\nMahasiswa yang memiliki nilai tertinggi  " + namaMahasiswa[Mahasiswa]);
        System.out.println("Nilai tertinggi, yaitu pada minggu ke-" + (Minggu + 1) + " dengan nilai " + nilaiTertinggi);
    }
}
