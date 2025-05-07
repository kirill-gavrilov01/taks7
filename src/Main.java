public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println(" Задача№1" );
        int clientOS = 1; // 0 для iOS, 1 для Android

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println(" Задача№2");
        int clientOS2 = 1;
        int clientDeviceYear = 2011;
        if (clientDeviceYear < 2015) {
            if (clientOS2 == 0) {
                System.out.println(" Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS2 == 1) {
                System.out.println(" Установите облегченную версию для Android по ссылке");
            } else {
                System.out.println(" Неизвестная операционная система");
            }
        } else {
            if (clientOS2 == 0) {
                System.out.println(" Установите приложение для iOS по ссылке");
            }
            else if (clientOS2 == 1) {
                System.out.println(" становите приложения дл Android по ссылке");
            } else {
                System.out.println(" Неизвестная операционная система");
            }
        }
        System.out.println(" Задача№3");
        int year = 2021;

        if (year > 1584 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println(year + " год является високосным");
        } else if (year > 1584) {
            System.out.println(year + " год не является високосным");
        } else {
            System.out.println("Год не может быть меньше 1585");
        }
        System.out.println(" Задача№4");
        int deliveryDistance = 95;
        int deliveryDays = 1;

        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        } else if (deliveryDistance > 60) {
            deliveryDays += 2;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance > 20) {
            deliveryDays += 1;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
        System.out.println(" Задача№5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
               System.out.println("Зима");
               break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
    }
}