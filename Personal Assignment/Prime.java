import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int n = sc.nextInt();

        boolean isPrime = true;

        for(int i=2;i<n/2;i++){
            if(n<=1){
                isPrime = false;
                break;
            }
            else{
                if(n % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        
        if(isPrime){
            System.out.print(+n+" is a Prime Number");
        }
        else{
            System.out.println(+n+" is not a Prime Number");
        }
        sc.close();
    }
}
