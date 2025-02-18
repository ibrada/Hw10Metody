public class Main {

    public static void check(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void installApp(int a, int b) {
        if (a == 0) {
            if (b < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (a == 1) {
            if (b < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static void delivary(int a, int b) {
        if (a < 100) {
            if (a < 20) {
                System.out.println("Потребуется дней " + (b + 1));
            } else if (a < 60) {
                System.out.println("Потребуется дней " + (b + 2));
            } else {
                System.out.println("Потребуется дней " + (b + 3));
            }
        } else {
            System.out.println("Доствки нет");
        }
    }

    public static void main(String[] args) {

        int year = 2024;
        check(year);

        int clientOS = 1;
        int clientDeviceYear = 2015;
        installApp(clientOS, clientDeviceYear);

        int deliveryDistance = 95;
        int deliveryDay = 0;
        delivary(deliveryDistance, deliveryDay);

    }
}