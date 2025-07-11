import java.util.Arrays;
import java.util.Scanner;
public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total elements: ");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the elements with spaces separated: ");
        String[] s= sc.nextLine().split(" ");

        int [] arr = new int[a];
        int count = 0;
        int [] brr = new int[count];
        for(int i=0;i<a;i++){
            arr[i]=Integer.parseInt(s[i]);
        }
        for (int i = 0;i<a;i++){
            if(arr[i]%2!=0){
                brr[count] = arr[i];
                count++;
            }
        }
        System.out.println("Odd elements: "+Arrays.toString(brr)+"\n Count: "+count);
        sc.close();
    }
}
