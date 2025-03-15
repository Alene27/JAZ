package pl.pjatk.alekoz;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

//@Component
public class Board {
    Game game;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        game = applicationContext.getBean("game", Game.class);
    }
}
