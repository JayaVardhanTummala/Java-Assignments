// 2 2 2 2 2 
// 2 1 1 1 2
// 2 1 0 1 2
// 2 1 1 1 2
// 2 2 2 2 2

import java.util.Scanner;

public class AdvP4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int n = sc.nextInt();
        
        for(int i=-n;i<=n;i++){
            for(int j=-n;j<=n;j++){
                System.out.print(Math.max(Math.abs(i), Math.abs(j))+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}