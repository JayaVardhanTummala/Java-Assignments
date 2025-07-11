import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int a = sc.nextInt();

        System.out.println("Enter the breadth: ");
        int b = sc.nextInt();
        
        int area = a * b;
        int per = 2 * (a + b);

        System.out.println("Area: "+area+"\nPerimeter: "+per);
        sc.close();
    }
}
