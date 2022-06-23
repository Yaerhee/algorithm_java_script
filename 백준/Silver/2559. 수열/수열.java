import java.io.IOException;
import java.util.Scanner;

public class Main extends IOException {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nums = sc.nextLine();

        String[] arr = nums.split(" ");
        int leng = Integer.parseInt(arr[0]); // 10
        int days = Integer.parseInt(arr[1]); // 5

        int[] temp = new int[leng];
        int tempResult = 0;
        for (int i = 0; i < days; i++) {
            temp[i] = Integer.parseInt(sc.next());
            tempResult += temp[i];
        }

        int total = tempResult;
        for (int i = 0; i < leng - days; i++) {
            tempResult -= temp[i];
            temp[i + days] = sc.nextInt();
            tempResult += temp[i + days];

            total = Math.max(total, tempResult);
        }

        System.out.println(total);

    }
}
