public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("задача 1");
        //if clientOS = 1 iOS
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else System.out.println("Установите версию приложения для Android по ссылке");
        System.out.println("________________");

        //Task 2
        System.out.println("задача 2");
        int clientDeviceYear = 2015;
        //if clientOS = 1 iOS, clientOS = 0 Android
        clientOS = 1;
        if (clientOS == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите обычную версию приложения для  Android по ссылке");
            } else System.out.println("Установите облегченную версию приложения для  Android по ссылке");
        }
        System.out.println("________________");

        //Task 3
        System.out.println("задача 3");
        int year = 2021;
        if (year > 1584 && year % 4 == 0) {
            if ((year % 100 == 0 && year % 400 == 0) || (year % 100 != 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        }
        else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println("________________");

        //Task 4
        System.out.println("задача 4");
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет");
        }
        System.out.println("________________");

        //Task 5
        System.out.println("задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("В году всего 12 месяцев");
        }

    }

}