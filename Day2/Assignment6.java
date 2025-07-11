import java.util.Scanner;
public class Assignment6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Numba: ");
        int a = sc.nextInt();
        System.out.println("Enter second numba: ");
        int b = sc.nextInt();

        System.out.println("Before Swapping: a = "+a+" and b = "+b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After Swapping: a = "+a+" and b = "+b);
        sc.close();
    }
}
