package main.java.com.andrii.practice.module02.task023;

/**
 * Created by Klu4nik on 19/02/2017.
 */
public class WithdrawalBalance {
    public static final double COMISSION_FIVE_PERCENT = 0.05;

    public static void main(String[] args) {
        WithdrawalBalance withdrawalBalance = new WithdrawalBalance();
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        String ownerName = "Ann";
        double withdrawal = 100;
        withdrawalBalance.moneysend(ownerName, ownerNames, balances, withdrawal);
        ownerName = "Oww";
        withdrawal = 490;
        withdrawalBalance.moneysend(ownerName, ownerNames, balances, withdrawal);


    }

    /*
    Method gets balance and withdrawal and print a information about operation
     */
    public boolean moneysend(String ownerName, String[] ownerNames, int[] balances, double withdrawal) {
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerName.equals(ownerNames[i])) {
                if (withdrawal * (1 + COMISSION_FIVE_PERCENT) < balances[i]) {
                    double comission = COMISSION_FIVE_PERCENT * withdrawal;
                    balances[i] -= (1 + COMISSION_FIVE_PERCENT) * withdrawal;
                    System.out.println("Ok. Your payment" + withdrawal + " was succesfull. Comission: " + comission + " Current balance" + balances[i]);
                    return true;
                } else {
                    System.out.println("No. Payment was declined. " + ownerNames[i] + "doesn't have enough money. " + ownerNames[i] + " balance:" + balances[i] + " No");
                    return false;
                }
            }
        }
        System.out.println("It's impossible to find owner with name " + ownerName);
        return false;


    }
}
