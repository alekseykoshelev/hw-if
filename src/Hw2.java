
public class Hw2 {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();


        int month = 1;
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима!");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Весна!");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("Лето!");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("Осень!");
                break;

            default:
                System.out.println("Укажите правильный месяц!");
        }


    }

    private static void task4() {
        int deliveryDistance = 95;
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет!");
        } else {
            int deliveryDays = 1;
            if (deliveryDistance > 20) {
                deliveryDays++;
            }
            if (deliveryDistance > 60) {
                deliveryDays++;
            }
            System.out.println("Потребуется дней: " + deliveryDays);
        }
    }

    private static void task3() {
        int year = 2023;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("год является високосным");
        } else {
            System.out.println("год не является високосным");
        }
    }

    private static void task2Ternary() {
        int clientOS = 1;
        int clientDeviceYear = 2015;

        String appType = clientDeviceYear < 2015 ? "облегченную" : "";
        String os = clientOS == 0 ? "iOS" : "Android";
        System.out.println("Установите " + appType + " версию приложения для " + os + " по ссылке");

    }

    private static void task2() {
        int clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    private static void task1() {
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");

        }
    }
}
