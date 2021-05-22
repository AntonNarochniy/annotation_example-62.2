package annotation_example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("annotation_example")
public class myConfig {


// объект Car создается при помощи аннотации @bean , в классе Car нет аннотации @Component или @Service
    @Bean
    public Car carBean(){
        return new Car();
    }
}
