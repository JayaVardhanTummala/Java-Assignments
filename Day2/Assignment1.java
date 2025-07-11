import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte b = sc.nextByte();
        short s = sc.nextShort();
        int i = sc.nextInt();
        float f = sc.nextFloat();
        double d = sc.nextDouble();
        
        System.out.println("Byte "+b+"Range: "+Byte.MIN_VALUE+"to"+Byte.MAX_VALUE);
        System.out.println("SHORT"+s+"Range: "+Short.MIN_VALUE+"to"+Short.MAX_VALUE);
        System.out.println("Int"+i+"Range: "+Integer.MIN_VALUE+"to"+Integer.MAX_VALUE);
        System.out.println("Float"+f+"Range: "+Float.MIN_VALUE+"to"+Float.MAX_VALUE);
        System.out.println("Dounle"+d+"Range: "+Double.MIN_VALUE+"to"+Double.MAX_VALUE);

        sc.close();
    }
}
