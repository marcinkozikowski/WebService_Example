/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webserviceclient;

import org.jg.rsi.HelloWorld;
import org.jg.rsi.HelloWorldImplService;

/**
 *
 * @author Dell
 */
public class WebServiceClient {
    public static void main(String[] args)
    {
        HelloWorldImplService helloService = new HelloWorldImplService();
        HelloWorld hello = helloService.getHelloWorldImplPort();
        
        String zapytanie = "To ja KLIENT 1";
        String response = hello.getHelloWorldAsString(zapytanie);
        
        System.out.println("Klient wysłał: "+zapytanie);
        System.out.println("Klient odebrał: "+response);
    }
    
}
