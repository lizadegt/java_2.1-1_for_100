public class Main {
    public static void main(String[] args) {
        int initialAccount = 100;
        int replenishmentAmount1 = 100;
        int replenishmentAmount2 = 1100;
        int finalAccount1;
        int bonus1;
        int finalAccount2;
        int bonus2;
        if (replenishmentAmount1 > 1000) {
            bonus1 = replenishmentAmount1 / 100;
            finalAccount1 = initialAccount + replenishmentAmount1 + bonus1;
        } else {
            bonus1 = 0;
            finalAccount1 = initialAccount + replenishmentAmount1;
        }
        if (replenishmentAmount2 > 1000) {
            bonus2 = replenishmentAmount2 / 100;
            finalAccount2 = initialAccount + replenishmentAmount2 + bonus2;
        } else {
            bonus2 = 0;
            finalAccount2 = initialAccount + replenishmentAmount2;
        }
        System.out.println(bonus1);
        System.out.println(finalAccount1);
        System.out.println(bonus2);
        System.out.println(finalAccount2);
    }
}
