import java.util.Scanner;
public class SumofAllDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int n = sc.nextInt();

        int sum = 0;
        int temp;
        while(n>0){
            temp = n%10;
            sum += temp;
            n = n/10;
        }
        System.out.print(sum);
        sc.close();
    }
}
