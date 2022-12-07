import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        System.out.println("Hello "+userName+" Welcome!");
    }
}
