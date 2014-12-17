/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsdlexampleclient;

import com.github.fawwaz.heroku.service.*;

/**
 *
 * @author Asus
 */
public class WsdlExampleClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Api api = new ApiImplService().getApiImplPort();
        // This line will send "koji, geraldi & fawwaz" to server, and server will give 
        // a response back to client with additional "Hello" Message in front of parameter sent to the server
        System.out.println(api.sayHi("Koji, Geraldi & Fawwaz"));
        
        
    }
    
}
