import java.util.Scanner;
public class Assignment9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a,b,c with spaces separated: ");
        String[] input = sc.nextLine().split(" ");

        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        if((a>b) && (a>c)){
            System.out.println(+a+"is the greatest");
        }else if((b > a)&&(b>c)){
            System.out.println(+b+" is the greatest");
        }else{
            System.out.println(+c+" is the greatest");
        }
        sc.close();
    }
}
