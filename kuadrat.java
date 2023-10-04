import java.util.Scanner;

public class kuadrat {
    public static void main(String[] args) {
        
        Scanner input02 = new Scanner(System.in);

        double a,b,c, D, x, x1, x2;

        System.out.print("masukkan nilai a : ");
        a = input02.nextDouble();

        System.out.print("masukkan nilai b : ");
        b = input02.nextDouble();

        System.out.print("masukkan nilai c : ");
        c = input02.nextDouble();

        D = b*b - 4*a*c;
        
        if(D > 0){
            x1 = (-b + Math.sqrt(D))/(2*a);
            x2 = (-b - Math.sqrt(D))/(2*a);

            System.out.println("nilai x1 " + x1);
            System.out.println("nilai x2 " + x2);
        }else if(D == 0){
            x = -b/2*a;
            System.out.println("nilai x = " + x);
        }else{
            System.out.println("bilangan imajiner");
        }

    }
}
