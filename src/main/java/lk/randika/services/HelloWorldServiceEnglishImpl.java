package lk.randika.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by Randika Lakmal on 1/21/2018.
 */
@Component
@Profile({"default","en"})
public class HelloWorldServiceEnglishImpl implements HelloWorldService {
    @Override
    public String getGreeting() {
        return "Hello World";
    }
}
