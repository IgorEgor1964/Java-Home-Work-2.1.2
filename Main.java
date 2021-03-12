public class Main {
    public static void main(String[] args) {
        boolean account = true;
        int limit = 1000; // если клиент пополняет счёт более чем на 1000 рублей
        int balance = 100; // на счёте 100 рублей
        int topUp = 1100; // пополнить счет на сумму ...
        int moneyBonus = balance + topUp + topUp/100;
        int moneyAmount = balance + topUp;

        if (topUp > limit) {
            System.out.println(moneyBonus);
        }
        if (topUp <= limit) {
            System.out.println(moneyAmount);
        }
    }
}