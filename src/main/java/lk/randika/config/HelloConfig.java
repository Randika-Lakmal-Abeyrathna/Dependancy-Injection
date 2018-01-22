package lk.randika.config;

import lk.randika.services.HelloWorldFactory;
import lk.randika.services.HelloWorldService;
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
    public HelloWorldFactory helloWorldFactory(){
        return new HelloWorldFactory();
    }

    @Bean
    @Profile("en")
    public HelloWorldService helloWorldServiceEnglishImpl(HelloWorldFactory factory){
        return factory.createHelloWorldService("en");
    }

    @Bean
    @Profile("sp")
    public HelloWorldService helloWorldServiceSpanishImpl(HelloWorldFactory factory){
        return factory.createHelloWorldService("sp");
    }
}
