import java.util.Scanner;

public class ArrayRataNilaiXX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;
        int lulusCount=0;
        int tidakLulusCount=0;
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();
        int[] nilaiMhs = new int[n];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();

            if (nilaiMhs[i] > 70) {
                jumlahLulus += nilaiMhs[i];
                lulusCount++;
            } else {
                jumlahTidakLulus+= nilaiMhs[i];
                tidakLulusCount++;
            }
        }

        double rata2Lulus = jumlahLulus/lulusCount ;
        double rata2TidakLulus = jumlahTidakLulus / tidakLulusCount ;

        System.out.println("Rata rata nilai lulus = " + rata2Lulus );
        System.out.println("Rata rata nilai tidak lulus = " + rata2TidakLulus );
    }
}