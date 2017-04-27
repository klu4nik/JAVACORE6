package main.java.com.andrii.practice.module06.task064;

/**
 * Created by Unicsoft on 27/04/2017.
 */
public class CitizenMain {
    public static void main(String[] args) {
        CitizenFactory.createUser(CitizenNatioanlity.RUSSIAN).sayHello();
        CitizenFactory.createUser(CitizenNatioanlity.ENGLISHMAN).sayHello();
        CitizenFactory.createUser(CitizenNatioanlity.CHINESE).sayHello();
        CitizenFactory.createUser(CitizenNatioanlity.ITALIAN).sayHello();

    }
}
