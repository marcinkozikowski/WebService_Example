/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebServices;
import org.jg.rsi.HelloWorldImpl;
import javax.xml.ws.Endpoint;
/**
 *
 * @author Dell
 */
public class HelloWorldPublisher {
    
    public static void main(String[] args)
    {
        Endpoint.publish("http://localhost:9999/ws/hello", new HelloWorldImpl());
        System.out.println("WebService opublikowany i czeka na klienta...");
    }
}
