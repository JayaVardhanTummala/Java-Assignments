import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input: ");
    int n = sc.nextInt();

    int a = 0;
    int b = 1;

    for(int i=0;i<n;i++){
        System.out.print(a+" ");
        int temp;
        temp = a + b;
        b = a;
        a = temp;
    }
    sc.close();

}
}