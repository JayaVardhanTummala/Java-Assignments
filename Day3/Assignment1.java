public class Assignment1{
    public static void main(String[] args) {
        int n = 5;
        String binary = String.format("%32s",Integer.toBinaryString(n)).replace(' ', '0');
        System.out.println("Binary: " +binary);
        int m = ~n;
        System.out.println("~"+n+" : "+m);
        System.out.println("Binary of ~"+n+" : "+Integer.toBinaryString(m));
    }
}