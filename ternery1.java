import java.util.Scanner;

public class ternery1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter a number");
        a= sc.nextInt();
        System.out.println("Enter a number");
        b= sc.nextInt();
        System.out.println("Enter a number");
        c= sc.nextInt();
        System.out.println((a > b) ? ((a > c) ? "A is the largest" : "C is the largest") : ((b > c) ? "B is the largest" : "C is the largest"));    }
}
