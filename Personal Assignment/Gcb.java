import java.util.Scanner;
public class Gcb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b :");

        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd =1;
        int min = Math.min(a,b);

        for(int i=1;i<min;i++){
            if(a % i ==0 && b % i == 0){
                gcd = i;
            }
        }

        System.out.print("The GCB for the given numbers is: "+gcd);
        sc.close();
    }
}
