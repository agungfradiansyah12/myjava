import java.util.Scanner;

public class Percobaan6_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p,l,t,L,vol;

        System.out.print("Masukkan panjang: ");
        p = input.nextInt();
        System.out.print("Masukkan lebar: ");
        l = input.nextInt();
        System.out.print("Masukkan tinggi: ");
        t = input.nextInt();

        // L=p*l;
        // System.out.println("Luas Persegi Panjang adalah "+L);

        // vol=p*l*t;
        // System.out.println("Volume balok adalah "+vol);

        L=hitungLuas(p, l);
        System.out.println("Luas Persegi Panjang adalah "+L);
        vol=hitungVol(t, p, l);
        System.out.println("Volume Balok adalah "+ vol);
    }

    static int hitungLuas (int pnjng, int lbr){
        int Luas = pnjng*lbr;
        return Luas;
    }

    static int hitungVol (int tinggi, int panjang, int lebar){
        int Volume= hitungLuas(panjang, lebar)*tinggi;
        return Volume;
    }

    
}
