import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MagicBox<Number> magicBox = new MagicBox<>(5);
        MagicBoxString<String> magicBoxString = new MagicBoxString(5);
        Scanner scanner = new Scanner(System.in);
        String text = "Выберите: \n" +
                "1. Положить объект.\n" + "2. Достать рандомное число.";
        String error = "Неверный ввод.";

        int x = 0;

        while (x == 0) {
            System.out.println("Выберите: \n" +
                    "1. Магическая коробка чисел.\n" + "2. Магическая коробка слов.\n" +
                    "3. Выход из программы");
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println(text);
                    switch (scanner.nextInt()) {
                        case 1:
                            System.out.println("Введите что нужно положить в коробку");
                            if (magicBox.add(scanner.nextInt()) == true){
                                System.out.println("Вы положили число.");
                            } else {
                                System.out.println("Коробка заполнена.");
                            }
                            break;
                        case 2:
                            System.out.println(magicBox.pick());
                            break;
                        default:
                            System.out.println(error);
                            break;
                    }
                    break;
                case 2:
                    System.out.println(text);
                    switch (scanner.nextInt()) {
                        case 1:
                            System.out.println("Введите что нужно положить в коробку");
                            if (magicBoxString.add(scanner.nextLine()) == true){
                                System.out.println("Вы положили число.");
                            } else {
                                System.out.println("Коробка заполнена.");
                            }
                            break;
                        case 2:
                            System.out.println(magicBoxString.pick());
                            break;
                        default:
                            System.out.println(error);
                            break;
                    }
                    break;
                case 3:
                    x++;
                    break;
                default:
                    System.out.println(error);
                    break;

            }
        }
    }
}