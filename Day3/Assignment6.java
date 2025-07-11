import java.util.Scanner;
public class Assignment6 {
    public static void printTable(int n){
        for(int i=1;i<11;i++){
            System.out.print(n*i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        printTable(n);
        sc.close();
    }
}
