public class Main {
    public static void main(String[] args) {
        int initial_account = 100;
        int replenishment_amount = 100;
        int final_account;
        int bonus;
        if (replenishment_amount > 1000) {
            bonus = replenishment_amount / 100;
            final_account = initial_account + replenishment_amount + bonus;
        } else {
            bonus = 0;
            final_account = initial_account + replenishment_amount;
        }
        System.out.println(bonus);
        System.out.println(final_account);
    }
}
