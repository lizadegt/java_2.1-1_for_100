public class Main {
    public static void main(String[] args) {
        int initial_account = 100;
        int replenishment_amount1 = 100;
        int replenishment_amount2 = 1100;
        int final_account1;
        int bonus1;
        int final_account2;
        int bonus2;
        if (replenishment_amount1 > 1000) {
            bonus1 = replenishment_amount1 / 100;
            final_account1 = initial_account + replenishment_amount1 + bonus1;
        } else {
            bonus1 = 0;
            final_account1 = initial_account + replenishment_amount1;
        }
        if (replenishment_amount2 > 1000) {
            bonus2 = replenishment_amount2 / 100;
            final_account2 = initial_account + replenishment_amount2 + bonus2;
        } else {
            bonus2 = 0;
            final_account2 = initial_account + replenishment_amount2;
        }
        System.out.println(bonus1);
        System.out.println(final_account1);
        System.out.println(bonus2);
        System.out.println(final_account2);
    }
}
