//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Homework {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int a = 2024;
        year(a);
    }

    public static void year(int yearToCheck) {
        if ((yearToCheck % 4 == 0 && yearToCheck % 100 != 0) || (yearToCheck % 400 == 0)) {
            System.out.println("Год " + yearToCheck + " високосный");
        } else {
            System.out.println("Год " + yearToCheck + " невисокосный");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int os = 0;
        int clientDeviceYear = 2018;
        findOutTheYear(os, clientDeviceYear);
    }
    public static void findOutTheYear(int clientDeviceYear, int os) {
        if ((os == 1) && (clientDeviceYear < 2015)) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if ((os == 1) && (clientDeviceYear >= 2015)) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if ((os == 0) && (clientDeviceYear < 2015)) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if ((os == 0) && (clientDeviceYear >= 2015)) {
            System.out.println("Установите версию приложения для iOS по ссылке");

        }
    }

    public static void task3() {
        System.out.println("Задача 3");

    }
}



