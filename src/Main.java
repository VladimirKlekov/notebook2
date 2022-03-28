import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> mys = new ArrayList<>();

        while (true) {

            System.out.println(mys);
            System.out.println("Выберите соответствующий пункт меню");
            System.out.println("1. Добавить задачу");
            System.out.println("2. Найти номер задачи по содержимому");
            System.out.println("3. Изменить задачу");
            System.out.println("4. Показать список задач");
            System.out.println("5. Удалить задачу из списка");
            System.out.println("6. Очистить список задач");
            System.out.println("Введите end для выхода из программы");
            String choice = scanner.nextLine();
            if ("end".equals(choice)) {
                System.out.println("Программа завершена");
                System.out.println("Спасибо за помощь в учебе!!! \uD83E\uDD17" );
                break;
            }
            int operation2 = Integer.parseInt(choice);
            switch (operation2) {
                case 1: {
                    System.out.println("Введите задачу");
                    String inputAdd = scanner.nextLine();
                    mys.add(inputAdd);
                    break;
                }
                case 2: {
                    System.out.println("Введите текст задачи для поиска ее номера");
                    String inputFind = scanner.nextLine();
                    System.out.println("Запрашиваемая задача в списке под номером: " + (mys.indexOf(inputFind) + 1));
                    break;
                }
                case 3: {
                    System.out.println("Введите номер задачи, которую надо изменить");
                    String inputChangeOld = scanner.nextLine();
                    int chang = Integer.parseInt(inputChangeOld);
                    System.out.println("Напечатайте новую задачу");
                    String inputChangeNew = scanner.nextLine();
                    mys.set(chang - 1, inputChangeNew);
                    System.out.println("Задача изменена");
                    break;
                }
                case 4: {
                    System.out.println("Ваш список задач: ");
                    for (int i = 0; i < mys.size(); i++) {
                        int j = i + 1;
                        System.out.println(j + ". " + mys.get(i));
                    }
                    break;

                }
                case 5: {
                    System.out.println("Введите номер задачи для ее удаления");
                    String inputRemove = scanner.nextLine();
                    int dell = Integer.parseInt(inputRemove);
                    mys.remove(dell - 1);
                    break;
                }
                case 6: {
                    mys.clear();
                    break;
                }
            }
        }
    }


}





