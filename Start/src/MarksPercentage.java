import java.util.Scanner;

public class MarksPercentage {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
         int marks1 = sc.nextInt();
         int marks2 = sc.nextInt();
         int marks3 = sc.nextInt();
         int marks4 = sc.nextInt();
         int marks5 = sc.nextInt();
         int percentage = ((marks1+marks2+marks3+marks4+marks5)*100)/500;
         System.out.println(percentage+"%");
    }
}
