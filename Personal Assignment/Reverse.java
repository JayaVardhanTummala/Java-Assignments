import java.util.Scanner;
public class Reverse {
    public static void rev(int m){
        int reve = 0;
        int rem;
        while(m>0){
            rem = m%10;
            reve = (reve*10) +rem;
            m = m/10;
        }
        System.out.println(reve);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        rev(n);
        sc.close();
    }
}
