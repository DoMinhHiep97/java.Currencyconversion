import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double rate=23000;
        System.out.println("Enter USD you want convert:");
        double USD=scanner.nextDouble();
        double VND=USD*rate;
        System.out.println("VND you have:"+VND);

    }
}
