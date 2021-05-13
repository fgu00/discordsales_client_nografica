/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.ds;

import java.util.HashMap;

/**
 *
 * @author lorenzotresoldi
 */
public class Chat implements Runnable {

    private HashMap<Integer,HashMap<String, Integer>>chat= new HashMap<Integer,HashMap<String, Integer>>();

    public Chat(HashMap<Integer,HashMap<String, Integer>>chat) {
        this.chat=chat;
    }
    

    @Override
    public void run() {
        
    }

    public HashMap<Integer, HashMap<String, Integer>> getChat() {
        return chat;
    }
    
    public HashMap<String, Integer> cerca(int nChat){
        return chat.get(nChat);
    }
    
    public void scrivi(){
        
    }
    
    
    
    
}
