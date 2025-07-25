import java.util.Scanner;
public class CharP3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int n = sc.nextInt();
        char ch = 'A';
        for(int i=0;i<n;i++){
            char ph = ch;
            for(int j=0;j<n;j++){
                System.out.print(ph+" ");
                ph++;
            }
            System.out.println();
        }sc.close();
    }
}
