import java.util.Scanner;
public class Assignment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();

        a = a+b;
        b= a - b;
        a = a - b;
        System.out.println("new a: "+a);
        System.out.println("new b: "+b);
        sc.close();
    }
}
