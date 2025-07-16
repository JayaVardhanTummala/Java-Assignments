import java.util.Scanner;
public class NP2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
