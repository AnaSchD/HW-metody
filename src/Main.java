import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        //task2();
        task3();
    }

    public static void task1() {
        int year = 2000;
        System.out.println(year + (outputTheYear(year)));
    }

    public static String outputTheYear(int thisYear) {
        if (thisYear % 4 == 0 && thisYear % 100 != 0 || thisYear % 400 == 0) {
            return (" - високосный год");
        } else {
            return (" - не високосный год");
        }
    }

  /*  public static void task2() {
        int clientOS = 0;
        int currentYear = LocalDate.now().getYear();
        System.out.println(currentYear + suggestVersion());
    }
    public static String suggestVersion( int clientOS, int currentYear) {

        if (clientOS == 1) {
            if ( currentYear >= 2015) {
               return ("Установите версию приложения для iOS по ссылке");

            } else {
                return ("Установи облегченную версию приложения для iOS по ссылке");
            }
        }
        {
            if (currentYear >= 2015) {
                return ("Установите версию приложения для Android по ссылке");

            } else {
               return ("Установи облегченную версию приложения для Android по ссылке");
            }
        }*/

     public static void task3() {
        int deliveryDistance = 95;
        System.out.println("" + daysForDelivery(deliveryDistance));
    }

    public static String daysForDelivery(int deliveryDistance1) {
        if (deliveryDistance1 <= 20) {
            return ("Потребуется дней " + 1);
        } else if (deliveryDistance1 > 20 && deliveryDistance1 <= 60) {
            return ("Потребуется дней " + 2);
        } else if (deliveryDistance1 > 60 && deliveryDistance1 <= 100) {
            return ("Потребуется дней " + 3);
        }
        return null;
    }

}

