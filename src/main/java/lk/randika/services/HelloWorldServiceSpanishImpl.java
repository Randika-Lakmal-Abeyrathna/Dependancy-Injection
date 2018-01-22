package lk.randika.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by Randika Lakmal on 1/21/2018.
 */
@Component
@Profile("sp")
public class HelloWorldServiceSpanishImpl implements HelloWorldService {

    @Override
    public String getGreeting() {
        return "Hola Mundo";
    }
}
