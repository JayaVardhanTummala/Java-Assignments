import java.util.Scanner;
public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=0;j<i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<((2*n - 2*i)+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }sc.close();
    }
}