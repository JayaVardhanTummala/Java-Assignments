// C C C C C 
// C B B B C
// C B A B C
// C B B B C
// C C C C C

import java.util.Scanner;
public class AdvP3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        char ch = 'A';
        for(int i=-n;i<=n;i++){
            for(int j=-n;j<=n;j++){
                System.out.print(((char)((ch)+(Math.max(Math.abs(i), Math.abs(j)))))+" ");
            }System.out.println();
        }
        sc.close();
    }
}
