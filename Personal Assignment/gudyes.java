import java.util.Scanner;

public class gudyes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ur YESponse: ");
        String res = sc.nextLine();
        int count = res.length();
        for(int i=0;i<=(count/3);i++){
            System.out.print("gud");
        }
        sc.close();
    }
}
