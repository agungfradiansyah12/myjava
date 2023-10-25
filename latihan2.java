import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hari, buku;
        String dayDiskon="rabu", bukuDis1="kamus", bukuDis2="novel";
        double diskon=0, plusDiskon=0, totDiskon;
        int jumlah;

        // Input
        System.out.println("Hari apa sekarang?");
        hari = sc.next();
        System.out.println("Buku apa yang anda beli?");
        buku = sc.next();
        System.out.println("Berapa jumlah buku yang anda beli?");
        jumlah = sc.nextInt();

        // Process
        if (hari.equals(dayDiskon)) {
            System.out.println("Hari rabu penuh diskon");
            if (buku.equals(bukuDis1)) {
                diskon = 10;
                if (jumlah > 2) {
                    plusDiskon = 2;
                }
            } else if (buku.equals(bukuDis2)) {
                diskon = 7;
                if (jumlah > 3) {
                    plusDiskon = 2;
                } else if (jumlah <= 3) {
                    plusDiskon = 1;
                }
            } else {
                if (jumlah > 3) {
                    diskon = 5;
                }
            }
        }

        // Result
        totDiskon = diskon+plusDiskon;
        System.out.println("Jumlah diskon yang anda dapatkan adalah " +totDiskon+ "%");
    }
}
