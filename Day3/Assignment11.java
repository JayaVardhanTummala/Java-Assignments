import java.util.Scanner;
public class Assignment11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Weight and Height with spaces separated: ");
        String[] input = sc.nextLine().split(" ");

        int n = Integer.parseInt(input[0]);
        float f = Float.parseFloat(input[1]);

        float bmi = n / (f*f);

        System.out.println("BMI: "+bmi);
        sc.close();
    }
}
