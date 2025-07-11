import java.util.Scanner;
public class Assignment6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2D-array size: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int [][] arr = new int[a][b];
        System.out.println("Enter the elements: ");
        for (int i = 0;i<a;i++){
            for (int j=0;j<b;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0;i<a;i++){
            for (int j = 0;j<b;j++){
                if(i==j){
                    System.out.print(+arr[i][j]+" ");
                }
            }
        }
        sc.close();
    }
}
