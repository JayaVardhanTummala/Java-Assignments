import java.util.Scanner;
public class Assignment4 {
    public static void changeValue(int x){
        x = 100;
        System.out.println("Duringg execution: "+x);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 10;
        System.out.println("Before execution : "+a);
        changeValue(a);
        System.out.println("After execution: "+a);
        sc.close();
    }
    
}
// Question:
// Create a method changeValue(int x) which sets x = 100.
// In main(), take an integer input from the user, call changeValue() with it, and then print the value of the original variable.
// Input Format:
// 10
// Output Format:
// Original value before function call: 10
// Value inside function: 100
// Original value after function call: 10
