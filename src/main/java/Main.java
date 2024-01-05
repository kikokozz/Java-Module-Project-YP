import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int howMany;
        System.out.println("На сколько человек необходимо разделить счёт?");
        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("Простите, возникла ошибка, не могли бы вы ввести число. На скольких человек необходимо разделить счёт?");
                scanner.next();
            } else if (scanner.nextInt() <= 1) {
                System.out.println("Простите, возникла ошибка, не могли бы повторить ввод. На скольких человек необходимо разделить счёт?");
            } else {
                System.out.println("Подтвердите количество человек, это нужно для корректного рассчёта");
                howMany = scanner.nextInt();
                System.out.println("Отлично, счет будет поделен на " + howMany + " человек");
                break;
            }

        }





    }
}
