import java.util.Scanner;

public class systemlogin {
    public static void main(String[] args) {
        String user = "user01";
        String pw = "11223344";

        Scanner input02 = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String inputUsername = input02.nextLine();
        System.out.print("Masukkan password: ");
        String inputPw = input02.nextLine();

        if (inputUsername.equals(user) && inputPw.equals(pw)) {
            System.out.println("Login berhasil!");
        } else {
            System.out.println("Username atau password anda salah!");
        }
    }
}
