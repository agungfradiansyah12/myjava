import java.util.Random;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Random random02 = new Random();
        Scanner input02 = new Scanner(System.in);

        char menu='y';

        do{
            int number = random02.nextInt(10)+1;
            boolean succes = false;
            do{
                System.out.print("Tebak angka (1-10): ");
                int answer = input02.nextInt();
                input02.nextLine();

                if(answer < number){
                    System.out.println("Angka yang anda tebak terlalu kecil");
                }else if(answer > number){
                    System.out.println("Angka yang anda tebak terlalu besar");
                }else{
                    System.out.println("Selamat, Anda benar!");
                    succes = true;
                }
            }while(!succes);
            System.out.println("Apakah Anda ingin mengulang permainan(Y/y)");
            menu=input02.nextLine().charAt(0);

            if(menu != 'y'&& menu !='Y'){
                break;
            }
        }while(true);

    }
}
