import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = sc2.nextInt();
        int i = 1;

        while(i<=N){
            int j = 1 ;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
