package pl.pjatk.alekoz;

import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;


//@Component
public class Player {
    public Player() {
        System.out.println("Player");
    }

    public void printMessage(){
        System.out.println("Player from something");
    }
}
