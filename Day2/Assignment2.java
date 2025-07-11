import java.util.Scanner;
public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit one: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        System.out.println("Addition: "+(a+b)+"\nSubtraction: "+(a-b)+"\nMultiplication: "+(a*b)+"\nDivision: "+(a/b)+"\nModulus: "+(a%b));
        System.out.println("Greaterthan?: "+(a>b)+"\nLessthan?: "+(a<b)+"\nEquals to?: "+(a=b));
        System.out.println("Logical AND (a>5 && b<10): "+(a > 5 && b < 10 )+"\nLogical OR (a>10 || b<10): "+((a>10 || b<10)));
        System.out.println("Bitwise AND: "+(a & b)+"\nBitwise OR: "+(a | b)+"\nLeft Shift: "+(a << 1)+"\nRightShift: "+(a >> 1));
        sc.close();
    }
    
}
