/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.restfulclient;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

/**
 * Jersey REST client generated for REST resource:GenericResource [generic]<br>
 * USAGE:
 * <pre>
 *        RestfulClient client = new RestfulClient();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author Flor
 */
public class RestfulClient {

    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://localhost:8080/StatisticRestfulServer/webresources";

    public RestfulClient() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("generic");
    }

    public <T> T getWordCount(Object requestEntity, Class<T> responseType) throws ClientErrorException {
        return webTarget.path("getWordCount").request(javax.ws.rs.core.MediaType.APPLICATION_XML).put(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_XML), responseType);
    }

    public <T> T getLineCount(Object requestEntity, Class<T> responseType) throws ClientErrorException {
        return webTarget.path("getLineCount").request(javax.ws.rs.core.MediaType.APPLICATION_XML).put(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_XML), responseType);
    }

    public <T> T getXml(Class<T> responseType) throws ClientErrorException {
        WebTarget resource = webTarget;
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T getLetterCount(Object requestEntity, Class<T> responseType) throws ClientErrorException {
        return webTarget.path("getLetterCount").request(javax.ws.rs.core.MediaType.APPLICATION_XML).put(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_XML), responseType);
    }

    public void close() {
        client.close();
    }
    
     public String callgetLetterCount(String input){
         String text = "";
         try {
         RestfulClient c = new RestfulClient();
         text = c.getLetterCount((String) input, String.class);
         }catch(Exception e){
             System.out.println(e.getMessage());
         }
     return text;
     }
    
     public String callgetLineCount(String input){
         String text = "";
         try {
         RestfulClient c = new RestfulClient();
         text = c.getLineCount((String) input, String.class);
         }catch(Exception e){
             System.out.println(e.getMessage());
         }
     return text;
     }
    
     public String callgetWordCount(String input){
         String text = "";
         try {
         RestfulClient c = new RestfulClient();
         text = c.getWordCount((String) input, String.class);
         }catch(Exception e){
             System.out.println(e.getMessage());
         }
     return text;
     }
    
}
