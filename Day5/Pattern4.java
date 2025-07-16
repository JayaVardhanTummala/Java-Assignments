import java.util.Scanner;
public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Input: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int st = i;
            int sp = n - st;
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=st;j++){
                System.out.print("*");
            }
            System.out.println();
        }sc.close();
    }
}