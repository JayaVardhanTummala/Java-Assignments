import java.util.Scanner;
public class Assignment7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Celsius value: ");
        float a = sc.nextFloat();

        float b = (a * 9/5) + 32;
        System.out.println("Farenheit Val: "+b);
        sc.close();
    }
}
