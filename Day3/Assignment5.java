import java.util.Scanner;
public class Assignment5 {
    public static void Max(int a, int b){
        if(a>b){
            System.out.println("Greater number: "+a);
        }
        else{
            System.out.println("Greater Number: "+b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();

        Max(a,b);
        sc.close();

    }
}
