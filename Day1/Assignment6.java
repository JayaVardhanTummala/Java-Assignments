public class Assignment6 {
    public static void firstStep(){
        System.out.println("FirstStep Method has started!!");
        secondStep();
        System.out.println("FirstStep Method has ended!");
    }
    public static void secondStep(){
        System.out.println("SecondStep Method has started!!");
        System.out.println("SecondStep Method has ended!");
    }
    public static void main(String[] args) {
        System.out.println("Main started!");
        firstStep();
        System.out.println("Main Method has ended!!");
    }
    
}
