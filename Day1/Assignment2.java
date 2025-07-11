import java.util.Scanner;
// public class Assignment2 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Give input for Integer, Float, and Number with spaces separated");
//         String input = sc.nextLine();

//         String[] parts = input.split(" ");
        
//         int intval = Integer.parseInt(parts[0]);
//         float floatval = Float.parseFloat(parts[1]);
//         int intval2 = Integer.parseInt(parts[2]);

//         System.out.println("Int: "+intval);
//         System.out.println("Float: "+floatval);
//         System.out.print("String: "+intval2);
//         sc.close();
//     }
    
// }
public class Assignment2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Int value: ");
        int valint = sc.nextInt();

        System.out.println("Enter Float Value: ");
        float valfloat = sc.nextFloat();

        System.out.println("Enter String value: ");
        String valstring = sc.next();

        float newint = valint;
        int newfloat = (int) valfloat;
        int newstring = Integer.parseInt(valstring);
        
        System.out.println("Int to float: "+newint+"Float to int: "+newfloat+"String to int: "+newstring);
        sc.close();

    }
}