package pl.pjatk.alekoz;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class propertiesBean {

    public propertiesBean(@Value("${something}") String myCustomProperty) {
        System.out.println(myCustomProperty);
    }
}
