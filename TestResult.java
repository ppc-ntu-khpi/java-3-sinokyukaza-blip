import java.util.Scanner;

public class TestResult {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Exercise exercise = new Exercise();

        System.out.print("Введіть число для перевірки: ");

        if (scanner.hasNextInt()) {

            int number = scanner.nextInt();
            boolean result = exercise.calculate(number);

            if (result) {
                System.out.println("Число " + number + " є числом Армстронга.");
            } else {
                System.out.println("Число " + number + " НЕ є числом Армстронга.");
            }

        } else {
            System.out.println("Помилка! Потрібно ввести ціле число.");
        }

        scanner.close();
    }
}