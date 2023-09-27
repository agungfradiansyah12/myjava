import java.util.Scanner;

public class PemilihanPercobaan2_02 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);
        System.out.print("Nilai uas\t : ");
        float uas = input02.nextFloat();
        System.out.print("Nilai uts\t : ");
        float uts = input02.nextFloat();
        System.out.print("Nilai kuis\t : ");
        float kuis = input02.nextFloat();
        System.out.print("Nilai Tugas\t : ");
        float tugas = input02.nextFloat();

        float total = (uas * 0.4f) + (uts * 0.3f) + (kuis * 0.1f) + (tugas * 0.2f);

        String message = total > 80  ? " A " :
        total > 73 && total <= 80 ? " B+ " :
        total > 65 && total <= 73 ? " B " :
        total > 60 && total <= 65 ? " C+ " :
        total > 50 && total <= 60 ? " C " :
        total > 39 && total <= 50 ? " D " :
        " E ";

        System.out.println("Nilai akhir anda adalah " + total + " sehingga nilai huruf anda adalah " + message);
        
    }
}
