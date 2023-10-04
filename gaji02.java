import java.util.Scanner;

public class gaji02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlMasuk, jmlTdkMasuk, TotGaji ;
        int gaji, potGaji;

        System.out.println("Gaji Karyawan PT. Sadar Barokah");
        System.out.print("Masukkan jumlah Masuk(hari)\t\t :");
        jmlMasuk = input.nextInt();
        System.out.print("Masukkan jumlah tidak masuk(hari)\t :");
        jmlTdkMasuk = input.nextInt();

        System.out.print("Masukkan besar gaji perhari\t\t :");
        gaji = input.nextInt();

        System.out.print("Masukkan potongan gaji\t\t\t :");
        potGaji = input.nextInt();
        
        TotGaji = (jmlMasuk*gaji)-(jmlTdkMasuk*potGaji);

        System.out.println("Total Gaji yang anda terima adalah\t :" + TotGaji);
    }
}
