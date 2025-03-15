package pl.pjatk.alekoz;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class AlekozApplication {

    public static void main(String[] args) {



        SpringApplication.run(AlekozApplication.class, args);
    }

}
