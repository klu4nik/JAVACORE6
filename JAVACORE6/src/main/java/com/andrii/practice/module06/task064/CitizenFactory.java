package main.java.com.andrii.practice.module06.task064;

/**
 * Created by Unicsoft on 27/04/2017.
 */
public class CitizenFactory {
    public static class Englishman implements Citizen {
        public void sayHello() {
            System.out.println("Hello.");
        }
    }

    public static class Chinese implements Citizen {
        public void sayHello() {
            System.out.println("嗨");
        }
    }

    public static class Russian implements Citizen {
        public void sayHello() {
            System.out.println("Привет");
        }
    }

    public static class Italian implements Citizen {
        public void sayHello() {
            System.out.println("Ciao");
        }
    }

    public static Citizen createUser(CitizenNatioanlity nation) {
        Citizen newCitizen = null;
        switch (nation) {
            case ENGLISHMAN:
                newCitizen = new Englishman();
                break;
            case CHINESE:
                newCitizen = new Chinese();
                break;
            case ITALIAN:
                newCitizen = new Italian();
                break;
            case RUSSIAN:
                newCitizen = new Russian();
                break;
        }
        return newCitizen;
    }
}
