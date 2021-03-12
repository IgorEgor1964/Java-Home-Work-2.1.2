public class Main {
    public static void main(String[] args) {
        boolean account = true;
        int limit = 1000; // если клиент пополняет счёт более чем на 1000 рублей
        int balance = 100; // на счёте 100 рублей
        int top = 2000; // пополнить счет на сумму ...
        int bonus = balance + top + top / 100;
        int amount = balance + top;

        if (top > limit) {
            System.out.println(bonus);
        }
        if (top <= limit) {
            System.out.println(amount);
        }
    }
}
