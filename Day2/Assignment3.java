import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbaaaa: ");
        int n = sc.nextInt();
        String result = (n%2 == 0)? "Even" : "Odd" ;
        System.out.println("The given number is "+result);
        sc.close();
    }
}
