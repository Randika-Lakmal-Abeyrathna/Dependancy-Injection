package lk.randika.config;

import lk.randika.services.HelloWorldServiceEnglishImpl;
import lk.randika.services.HelloWorldServiceSpanishImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by Randika Lakmal on 1/22/2018.
 */
@Configuration
public class HelloConfig {

    @Bean
    @Profile("en")
    public HelloWorldServiceEnglishImpl helloWorldServiceEnglishImpl(){
        return new HelloWorldServiceEnglishImpl();
    }

    @Bean
    @Profile("sp")
    public HelloWorldServiceSpanishImpl helloWorldServiceSpanishImpl(){
        return new HelloWorldServiceSpanishImpl();
    }
}
