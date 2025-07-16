import java.util.Scanner;
public class PrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();


        for(int i=a;i<=b;i++){
            boolean isPrime = true;
            
            for(int j=2;j<=i/2;j++){
                if(i<=1){
                    isPrime = false;
                    break;
                }

                if(i % j == 0){
                    isPrime = false;
                    break;
                }

            }
            if(isPrime){
                System.out.print(i+" ");
                }
        }
        sc.close();

    }
}
