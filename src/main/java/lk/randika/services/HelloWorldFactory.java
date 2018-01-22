package lk.randika.services;

/**
 * Created by Randika Lakmal on 1/22/2018.
 */
public class HelloWorldFactory {

    public HelloWorldService createHelloWorldService(String language){

        HelloWorldService helloWorldService = null;

        switch (language){
            case "en":
                helloWorldService = new HelloWorldServiceEnglishImpl();
                break;
            case "sp":
                helloWorldService = new HelloWorldServiceSpanishImpl();
                break;
            case "hi":
                helloWorldService = new HelloWorldServiceHindiImpl();
                break;
            case "lt":
                helloWorldService = new HelloWorldServiceLatinlImpl();
                break;
            default:new HelloWorldServiceEnglishImpl();

        }
        return  helloWorldService;

    }

}
