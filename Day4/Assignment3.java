import java.util.Scanner;
public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total elements count: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max = arr[0];

        for (int i=1;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        if(max%2==0){
            System.out.println("Max is Even");
        }else{
            System.out.println("Max is Odd");
        }
        System.out.println(+max);
        sc.close();
    }
}
