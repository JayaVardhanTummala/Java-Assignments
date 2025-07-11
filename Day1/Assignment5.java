import java.util.Arrays;
public class Assignment5 {
    public static void afterChange(int[] ar){
        ar[0] = 99;
        System.out.println("During Modifications: "+Arrays.toString(ar));
    }
    public static void main(String[] args){
        int[] arr = {1,2,3};

        System.out.println("Before Modifications: " +Arrays.toString(arr));
        afterChange(arr);
        System.out.println("After modifications: "+Arrays.toString(arr));
    }
    
}