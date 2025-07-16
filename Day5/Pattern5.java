import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            int sp = i;
            int st = n - i;
            for(int j=1;j<=st;j++){
                System.out.print("*");
            }

            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}