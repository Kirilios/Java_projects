package java_seminars;

import java.time.LocalTime;
import java.util.Scanner;

// В консоли запросить имя пользователя.
// В зависимости от текущего времени, вывести приветствие вида
// "Доброе утро, <Имя>!", если время от 05:00 до 11:59
// "Добрый день, <Имя>!", если время от 12:00 до 17:59;
// "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
// "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
public class task3 {
    public static void main(String[] args) {
        System.out.println("Введите имя ");
        Scanner sc = new Scanner(System.in, "ср866");
        String name = sc.next();
        // System.currentTimeMillis()
        LocalTime time = LocalTime.now();
        if (time.isAfter(LocalTime.of(12, 0))) &&{
            time.isBefore(LocalTime.of(18, 0));
            {

                System.out.println("Добрый день " + name);
            }
            elseif {
                System.out.println("Добрый день " + name);
            }
        }
    }
}

