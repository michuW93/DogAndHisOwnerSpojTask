import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double sowner = scanner.nextInt();
        double vowner = scanner.nextInt();
        double vdog = scanner.nextInt();

        double towner = sowner/vowner;
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println(df.format(towner*vdog));
    }
}
