import java.util.Scanner;
public class CharP4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int n = sc.nextInt();
        char ch=65;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(ch);
            }
            ch +=i;
            System.out.println();
        }
        sc.close();
    }
}