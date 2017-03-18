package main.java.com.andrii.practice.module03.task032;

/**
 * Created by Klu4nik on 04/03/2017.
 */
public class Adder extends Arithmetic {
    public static void main(){
        Arithmetic arift1= new Arithmetic();
        Adder add1= new Adder();
        System.out.println(arift1.add(12,15));
    }
    public boolean check(int a,int b){
        System.out.println("Check is:");
        return a>=b?true:false;
    }

}
