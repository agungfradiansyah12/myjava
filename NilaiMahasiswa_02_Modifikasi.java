import java.util.Scanner;

public class NilaiMahasiswa_02_Modifikasi {
    static Scanner sc02 = new Scanner(System.in);
    static int jumlahMahasiswa;
    static int jumlahTugas;
    static String[] namaMahasiswa;
    static double[][] nilaiMahasiswa;

    // Fungsi untuk meninputkan data nilai mahasiswa
    static void inputJumlahMahasiswaTugas() {
        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMahasiswa = sc02.nextInt();
        System.out.print("Masukkan jumlah tugas: ");
        jumlahTugas = sc02.nextInt();

        namaMahasiswa = new String[jumlahMahasiswa];
        nilaiMahasiswa = new double[jumlahMahasiswa][jumlahTugas];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = sc02.next();
        }
    }

    // Fungsi untuk meninputkan data nilai mahasiswa
    static void inputNilai() {
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\nMasukkan nilai " + namaMahasiswa[i]);
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print("Tugas ke-" + (j + 1) + " : ");
                nilaiMahasiswa[i][j] = sc02.nextDouble();
            }
        }
    }

    // Fungsi untuk menampilkan seluruh nilai mahasiswa mulai dari minggu pertama sampai ketujuh
    static void datanilaiMahasiswa() {
        System.out.println("Nilai tugas mahasiswa dari tugas 1 hingga " + jumlahTugas + " berturut-turut :");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Mahasiswa " + namaMahasiswa[i] + "\t: ");
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print(nilaiMahasiswa[i][j] + ", ");
            }
            System.out.println();
        }
    }

    // Fungsi untuk mencari pada hari keberapakah terdapat nilai tertinggi dibanding hari lain dari keseluruhan mahasiswa
    static int mingguTertinggi() {
        double nilaiTertinggi = 0;
        int TugasTertinggi = 0;

        for (int j = 0; j < jumlahTugas; j++) {
            double totalNilaiTugas = 0;
            for (int i = 0; i < jumlahMahasiswa; i++) {
                totalNilaiTugas += nilaiMahasiswa[i][j];
            }
            if (totalNilaiTugas > nilaiTertinggi) {
                nilaiTertinggi = totalNilaiTugas;
                TugasTertinggi = j;
            }
        }
        return TugasTertinggi + 1;
    }

    public static void main(String[] args) {
        inputJumlahMahasiswaTugas();
        inputNilai();
        System.out.println();
        datanilaiMahasiswa();
        printNilaiTertinggiMahasiswa();
    }

    // Fungsi untuk menampilkan mahasiswa yang memiliki nilai tertinggi 
    static void printNilaiTertinggiMahasiswa() {
        double nilaiTertinggi = 0;
        int Mahasiswa = 0;
        int Tugas = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            for (int j = 0; j < jumlahTugas; j++) {
                if (nilaiMahasiswa[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMahasiswa[i][j];
                    Mahasiswa = i;
                    Tugas = j;
                }
            }
        }
        System.out.println("\nMahasiswa yang memiliki nilai tertinggi  " + namaMahasiswa[Mahasiswa]);
        System.out.println("Nilai tertinggi, yaitu pada tugas ke-" + (Tugas + 1) + " dengan nilai " + nilaiTertinggi);
    }
}
