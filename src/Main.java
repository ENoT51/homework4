
public class Main {
    public static void main(String[] args) {
    char clientOS = '0';
    switch (clientOS){
        case '0':
            System.out.println("Установите версию приложения для iOS по ссылке");
            break;
        case '1':
            System.out.println("Установите версию приложения для Android по ссылке");
            break;
        default:
            System.out.println("Вы ввели некорректные данные");
    }
    // Задача 2
    int clienOS2 = 0;
    int clienData = 2016;
    if (clienOS2 == 0 && clienData > 2015) {
        System.out.println("Установите версию приложения для iOS по ссылке");
    } else if (clienOS2 == 0 && clienData <= 2015) {
        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
    }
    if (clienOS2 == 1 && clienData > 2015) {
        System.out.println("Установите версию приложения для Android по ссылке");
    } else if (clienOS2 == 1 && clienData <= 2015) {
        System.out.println("Установите облегченную версию приложения для Android по ссылке");
    }
    //Задача 3
    int year = 1594;
    if (year < 1584){
        System.out.println("Високосный год ввели в 1584");
    }
     else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
        System.out.println(year + " год является високосным");
    } else {
        System.out.println(year + " год не является високосным");
    }
    // Задача 4
    int deliveryDistance = 120;
     if ( deliveryDistance > 0 && deliveryDistance < 20){
         System.out.println("Потребуется дней: 1");
     } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
         System.out.println("Потребуется дней: 2");
     } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
         System.out.println("Потребуется дней: 2");
     } else {
         System.out.println("Доставки нет");
     }

    // Задача 5
    int monthNumber = 11;
    switch (monthNumber){
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
            System.out.println("Не правильно введён месяц");
    }
    }
    }
