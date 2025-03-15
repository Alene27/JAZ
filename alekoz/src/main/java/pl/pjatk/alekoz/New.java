package pl.pjatk.alekoz;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class New {

    @Bean
    public Game Game() {
        return new Game(new Player());
    }
}
