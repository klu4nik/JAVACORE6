package main.java.com.andrii.practice.module03.task034;

/**
 * Created by Klu4nik on 25/03/2017.
 */
public class Main {
    public static void main(String[] args) {
        User employee1 = new User("John Doe", 20000, 12, "Minfin", 27000, "UAH");
        double withdrawFromAccaunt = 3665.99;

        employee1.paySalary();
        employee1.withdraw(withdrawFromAccaunt);
        employee1.companyNameLength();
        employee1.monthIncreaser(5);
    }
}
