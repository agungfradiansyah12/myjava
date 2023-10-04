import java.util.Scanner;

public class cobalingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r;
        double keliling, luas;
        System.out.println("Masukkan jari-jari Lingkaran");
        System.out.print("r = ");
        r = input.nextInt();
        if(r == 7){
            keliling = 22/7*2*r;
        }else {
            keliling = 2*3.14*r;
        }
        
        luas = 3.14*r*r;
        System.out.println("Keliling Lingkaran adalah "+ keliling );
        System.out.println("Luas Lingkaran adalah "+ luas);
    }
}
