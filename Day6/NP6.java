import java.util.Scanner;

public class NP6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=n;j>=n-i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}