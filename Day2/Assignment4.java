import java.util.Scanner;
public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Original: "+n);
        int a = (n++);
        int b = ++n;
        int c = n--;
        int d = --n;
        System.out.println("n++: "+a);
        System.out.println("++n: "+b);
        System.out.println("n--: "+c);
        System.out.println("--n: "+d);
        sc.close();

    }
}
