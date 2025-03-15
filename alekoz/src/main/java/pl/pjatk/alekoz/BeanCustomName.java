package pl.pjatk.alekoz;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanCustomName {

    @Bean
    public Object defaultData(){
        return new Object();
    }
}
