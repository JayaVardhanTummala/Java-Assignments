import java.util.Scanner;
public class Assignment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int a = sc.nextInt();

        int [] arr = new int[a];
        int sum = 0;
        int count = 0;

        System.out.println("Enter the array elements: ");
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
            if(arr[i] >= 0){
                sum+=arr[i];
                count++;
            }
        }
        float avg = sum/count;
        System.out.println("Avg: "+avg);
        sc.close();



    }
}
