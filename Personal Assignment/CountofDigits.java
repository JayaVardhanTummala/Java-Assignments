import java.util.Scanner;
public class CountofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int n = sc.nextInt();

        int count = 0;
        while(n>0){
            n = n/10;
            count+=1;
        }

        System.out.print(count);
        sc.close();
    }
}
