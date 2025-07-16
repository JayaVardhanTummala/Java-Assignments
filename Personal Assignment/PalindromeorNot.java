import java.util.Scanner;
public class PalindromeorNot {
    static void palindrome(int n){
        int rev = 0;
        int rem;
        while(n>0){
            rem = n%10;
            rev = (rev * 10) + rem;
            n = n/10;
        }
        if(rev == n){
            System.out.print("The number is Palindrome");
        }
        else{
            System.out.print("The number is not a Palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int n = sc.nextInt();
        palindrome(n);
        sc.close();
    }
}
