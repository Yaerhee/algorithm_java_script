import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        String total = sc.next();

        int realTotal = 0;

        for (int i = 0; i < nums; i++) {
            int partialNum = Integer.parseInt(String.valueOf(total.charAt(i)));
            realTotal += partialNum;
        }

        System.out.println(realTotal);
    }
}
