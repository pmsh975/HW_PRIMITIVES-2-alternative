public class Main {
    public static void main(String[] args) {

        int account = 100; // начальный счет

        int payment = 50; // сумма пополнения

        int limit = 1000; // сумма от которой начисляются бонусы

        int bonus;
        int total;
        if (payment > limit) {
            bonus = payment / 100; // кол-во бонусов
            total = account + bonus + payment; // итоговая сумма на счету
            System.out.println("Вам начислено " + bonus + " бонусных рублей" + ", итоговая сумма на счету " + total + " рублей.");
        } else {
            bonus = 0;
            total = account + payment;
            System.out.println("Бонусов нет" + ", итоговая сумма на счету " + total + " рублей.");
        }

    }
}
