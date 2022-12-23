import java.util.Scanner;

public abstract class Task5 {
    public static void main(String[] args) {
        String num = "a";
        while (!num.equals(".")) {
            System.out.print("Введите дробное число: ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            if (!input.matches(".?\\d.?\\d?")) {
                System.out.println("Некорректный ввод:\n" + input + "\n");
            } else {
                float number = Float.parseFloat(input);
                System.out.printf("Дробное число:\n%.3f\n\n", number);
            }
            num = input;
        }
    }
}
