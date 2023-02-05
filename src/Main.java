public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    private static void task7() {
        int one = 1;
        int two = 2;
        int three = 3;

        int max;
        if (one > two) {
            max = one;
        } else {
            max = two;
        }
        if (max < three) {
            max = three;
        }
        System.out.println("Большее число " + max);
    }

    private static void task6() {
        int totalCapacity = 102;
        int seatCapacity = 60;
        int busy = 62;
        if (busy <= totalCapacity) {
            if (busy <= seatCapacity) {
                System.out.println("Есть сидячее место!");
            } else {
                System.out.println("Только стоя!");
            }
        } else {
            System.out.println("Мест нет!");
        }
    }

    private static void task5() {
        boolean isAdultHere = true;
        int age = 7;
        if (age < 5) {
            System.out.println("Нельзя кататься на аттракционе");
        }
        if (age >= 5 && age < 14 && isAdultHere) {
            System.out.println("Можно кататься на аттракционе в сопровождении взрослого");
        }
        if (age >= 14) {
            System.out.println("Можно кататься на аттракционе без сопровождения взрослого");
        }
    }

    private static void task4() {
        int age = 19;
        if (age >= 2 && age <= 6) {
            System.out.println("Нужно ходить в детский сад");
        }
        if (age >= 7 && age <= 18) {
            System.out.println("Нужно ходить в школу");
        }
        if (age > 18 && age <= 24) {
            System.out.println("Нужно ходить в университет");
        }
        if (age > 24) {
            System.out.println("Нужно ходить на работу");
        }
    }

    private static void task3() {
        var speed = 61;
        if (speed > 60) {
            System.out.println("Придется заплатить штраф");
        } else {
            System.out.println("Можно ездить спокойно");
        }
    }


    private static void task2() {
        int temp = 6;
        if (temp < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
    }

    private static void task1() {
    /*
    Задача 1
С помощью условного оператора напишите программу, которая выводит в консоль:

сообщение о том, что человеку 18 или больше лет;
сообщение, что возраст совершеннолетия еще не наступил и нужно немного подождать.
При выполнении каждого условия программа должна выводить в консоль сообщение в формате: «Если возраст человека равен …,
то (вывести в зависимости от результата) он совершеннолетний / он не достиг совершеннолетия, нужно немного подождать»
     */

        int age = 18;
        if (age >= 18) {
            System.out.println("Он совершеннолетний");
        } else {
            System.out.println("Он не достиг совершеннолетия, нужно немного подождать");
        }
    }
}