package main.java.com.andrii.practice.module03.task031;

/**
 * Created by Klu4nik  on 25/02/2017.
 */
public class SingConstract {
    public void changeSong(){
        Bird bird = new Bird();
        String[] song={"Im singing", "Im flying", "Im walking", "Im Bird"};
        bird.sing(song);
    }
}
