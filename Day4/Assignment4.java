import java.util.Arrays;
import java.util.Scanner;
public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();

        int [] arr = new int[n];
        int [] brr = new int[n];
        int count = 0;
        System.out.println("Enter the array elements: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the comparitive element: ");
        int c = sc.nextInt();

        for(int i=0;i<n;i++){
            if(arr[i]>c){
                brr[count] = arr[i];
                count++;
            }
        }
        System.out.print("Elements greater than "+c+":"+Arrays.toString(brr));
        sc.close();
    }
}
