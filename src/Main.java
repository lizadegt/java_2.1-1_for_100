public class Main {
    public static void main(String[] args) {
        int initialAccount = 100;
        int replenishmentAmount = 100;
        int finalAccount;
        int bonus;
        if (replenishmentAmount > 1000) {
            bonus = replenishmentAmount / 100;
            finalAccount = initialAccount + replenishmentAmount + bonus;
        } else {
            bonus = 0;
            finalAccount = initialAccount + replenishmentAmount;
        }
        System.out.println(bonus);
        System.out.println(finalAccount);
    }
}
