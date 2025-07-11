import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input: ");
        int n = sc.nextInt();

        int m = (n >> 2);
        int p = (n >>> 2);

        System.out.println("Signed: "+m+"\nUnsigned: "+p);
        sc.close();
    }
}
