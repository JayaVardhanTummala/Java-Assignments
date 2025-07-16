import java.util.Scanner;

public class NP9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            int k =1;
            for(int j=0;j<((2*i)+1);j++){
                System.out.print(k);
                if(j<(2*i)/2){
                    k++;
                }
                else{
                    k--;
                }
            }System.out.println();
        }sc.close();
    }
}
