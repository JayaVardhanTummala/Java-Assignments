import java.util.Scanner;

public class Assignment1{
    public static void main(String[] args){
    // String name = "ravi";
    // int age = 20;
    // float cgpa = 8.5f;
    
    // System.out.println(name);
    // System.out.println(age);
    // System.out.print(cgpa);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name bhaisaaab: ");
        String name = sc.nextLine();

        System.out.println("Whats ur age nigg?");
        int age = sc.nextInt();

        System.out.print("Your Name is: "+name+" and Your age is: "+age);

        sc.close();
    }}