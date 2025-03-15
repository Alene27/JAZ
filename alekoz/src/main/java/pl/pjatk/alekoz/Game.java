package pl.pjatk.alekoz;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

//@Component
public class Game {
    Player player;

    public Game(Player player) {
        System.out.println("Game");
        player.printMessage();
    }
}
