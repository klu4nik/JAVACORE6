package main.java.com.andrii.practice.module03.task033;

/**
 * Created by Klu4nik on 04/03/2017.
 */
public class SpecialStudent extends CollegeStudent {
    long secretKey;
    String email;
    public SpecialStudent ( String firstName, String lastName, int group){
        super(firstName, lastName, group);
    }
    public SpecialStudent( String lastName, Course[] coursesTaken){
        super(lastName, coursesTaken);
    }
    public SpecialStudent(long secretKey){
        super();
        this.secretKey=secretKey;
    }

    public long getSecretKey(){
        return secretKey;
    }
    public String getEmail(){
        return email;
    }
    public void setSecretKey(long secretKey){
        this.secretKey=secretKey;
    }
    public void setEmail(String email){
        this.email=email;
    }


}
