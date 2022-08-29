public class Main {
    public static void main(String[] args) {
        task0();
        task1();
        task2();
        task3();
    }


    public static void task0() {
        int a = 5;
        int b = 6;
        sum(a, b);
    }

    public static void sum(int x, int y) {
        int sum = x + y;
        System.out.println(sum);

    }

    public static void task1() {
        int year = 2000;
        checkYear(year);
    }

    public static void checkYear(int year) {

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    public static void task2() {
        boolean typeOC = true;
        int clientDeviceYear = 2016;
        applicationVersion(typeOC, clientDeviceYear);
    }

    public static void applicationVersion(boolean typeOC, int clientDeviceYear) {
        if (clientDeviceYear < 2015 && !typeOC) {
            System.out.println("Установите облегченную версию для iOS по ссылке");
            return;
        }

        if (clientDeviceYear >= 2015 && !typeOC) {
            System.out.println("Установите обычную версию для iOS по ссылке");
            return;
        }
        if (clientDeviceYear < 2015 && typeOC) {
            System.out.println("Установите облегченную версию для Android по ссылке");
            return;
        } else {
            System.out.println("Установите обычную версию для Android по ссылке");
            return;
        }
    }

    public static void task3() {
        int deliveryDistance = 95;
        System.out.println(daysForDelivery(deliveryDistance));

    }

    public static int daysForDelivery(int deliveryDistance) {
        int days = 0;
        if (deliveryDistance <= 20) {
            days = 1;
            return days;
        } else {
            if ((deliveryDistance - 20) % 40 != 0) {
                days = ((deliveryDistance - 20) / 40) + 2;
            } else {
                days = ((deliveryDistance - 20) / 40) + 1;
            }

        }
        return days;
    }
}










