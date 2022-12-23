import java.util.Arrays;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        String[] abc = { "1", "2", "3", "4"};
        Scanner scanner = new Scanner(System.in);
        abc[3] = scanner.nextLine();
        if (abc[3].equals("")) {
            throw new NullPointerException("пустые строки вводить нельзя");
        }
        System.out.println(Arrays.toString(abc));
    }
}
