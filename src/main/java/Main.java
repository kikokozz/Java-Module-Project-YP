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

        Calculator calculator = new Calculator();

        while (true) {
            scanner.nextLine();
            System.out.println("Пожалуйста, введите название товара");
            String tovar = scanner.nextLine();
            System.out.println("Пожалуйста, введите стоимость товара в формате \"рубли,копейки\"");
            if (scanner.hasNextDouble()) {
                double cost = scanner.nextDouble();
                calculator.tovarName(tovar, cost);
                System.out.println("Если желаете заказать что-то ещё, напишите любой символ. \n" + "Если желаете закончить заказ, напишите \"Завершить\".");
            }
            else {
                System.out.println("Введено некорректное значение цены товара, пожалуйста, повторите заказ.");
            }
            String nextVvod = scanner.next();
            if (nextVvod.equalsIgnoreCase("Завершить")) {
                //String tovar1 = "";
               // calculator.removeLastChar(tovar1);
                calculator.check(howMany);
                System.out.println(calculator.price(howMany));
                break;
            }
        }
        scanner.close();
    }
}
