import java.util.Scanner;

public class NP5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input: ");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<=n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}