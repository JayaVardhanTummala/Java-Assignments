import java.util.Scanner;
public class Assignment8 {
    public static void Div(int[] brr){
        int count = 0;
        for(int i=0;i<brr.length;i++){
            if(brr[i]%3==0){
                count+=1;
            }
        }
        System.out.println("Total no of elements which can be divided by 3: "+count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total values count: ");
        int n = sc.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        Div(arr);
        sc.close();
    }
}
