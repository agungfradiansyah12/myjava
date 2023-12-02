import java.util.Scanner;

public class Percobaan2_02 {
    static int hitungPangkat(int x, int y){
        if(y == 0){
            return (1);
        }else{
            System.out.print(x + "x");
            return ( x * hitungPangkat(x, y -1 ));
        }
    }

    public static void main(String[] args) {
        Scanner sc02 = new Scanner(System.in);
        int bilangan, pangkat;
        System.out.print("Bilangan yang dihitung: ");
        bilangan = sc02.nextInt();
        System.out.print("Pangkat: ");
        pangkat = sc02.nextInt();
        
        System.out.print("hitung pangkat(" + bilangan + "," +pangkat+ ") dicetak " );
        int hasil = hitungPangkat(bilangan, pangkat);
        System.out.print("= " + hasil);
    }
}
