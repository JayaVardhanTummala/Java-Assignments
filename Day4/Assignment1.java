import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of elements: ");
        int s = sc.nextInt();

        int [] arr = new int[s];
        int sum=0;
        System.out.println("Enter the elements: ");
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2 ==0){
                sum = sum+arr[i];
            }
        }
        System.out.println("Even Sum: "+sum);
        sc.close();

    }
}
