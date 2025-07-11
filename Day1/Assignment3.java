import java.util.Scanner;
public class Assignment3 {
    public static void greetUser(String name){
        System.out.print("Hello "+name+" ,Welcome to MERN + DSA ST COURSE");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        greetUser(name);
        sc.close();
    }
}
