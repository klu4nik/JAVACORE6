package main.java.com.andrii.practice.module02.task024;

/**
 * Created by Klu4nik on 19/02/2017.
 */
public class FundBalance {
    public static void main(String[] args) {
        FundBalance fundBalance = new FundBalance();
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        String ownerName = "Ann";
        double withdrawal = 100;

        fundBalance.fund(ownerName, ownerNames, balances, withdrawal);

        ownerName = "Oww";
        withdrawal = 490;
        fundBalance.fund(ownerName, ownerNames, balances, withdrawal);


    }

    /*
    Method gets balance and withdrawal and print a information about operation
     */
    public boolean fund(String ownerName, String[] ownerNames, int[] balances, double withdrawal) {
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerName.equals(ownerNames[i])) {
                balances[i] += withdrawal;
                System.out.println("We fund  balance of " + ownerNames[i] + ". Current balance: " + balances[i]);
                return true;
            }
        }

        System.out.println("It's impossible to find owner with name " + ownerName);
        return false;


    }

}
