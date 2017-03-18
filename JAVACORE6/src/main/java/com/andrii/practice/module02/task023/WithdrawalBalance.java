package main.java.com.andrii.practice.module02.task023;

/**
 * Created by Klu4nik on 19/02/2017.
 */
public class WithdrawalBalance {
    public static void main(String[] args){
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        String ownerName = "Ann";
        double withdrawal = 100;

        moneysend(ownerName, ownerNames, balances,withdrawal);

        ownerName = "Oww";
        withdrawal = 490;
        moneysend(ownerName, ownerNames, balances,withdrawal);



    }
    /*
    Method gets balance and withdrawal and print a information about operation
     */
    private boolean moneysend(String ownerName, String[] ownerNames, int[] balances, double withdrawal){
        for (int i=0; i<ownerNames.length;i++){
            if (ownerName.equals(ownerNames[i])){
                if(withdrawal*1.05<balances[i]){
                    double comission=0.05*withdrawal;
                    balances[i]-=1.05*withdrawal;
                    System.out.println(ownerNames[i]+ " " + comission + " " + balances[i] );
                    return true;
                } else {
                    System.out.println(ownerNames[i] +" No");
                    return false;
                }
            }
        }
        System.out.println("It's impossible to find owner with name " + ownerName);
        return false;


    }
}
