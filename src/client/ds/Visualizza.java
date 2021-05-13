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

//realizzare gui

public class Visualizza {
    private Canali canali;
    private Chat chat;
    

    public Visualizza(Canali canali, Chat chat) {
        this.canali = canali;
        this.chat = chat;
    }
    
    public void stampa_canale(String nomeCanale){
        int var;
        var=canali.cerca(nomeCanale);
        
    }
    
    public void stampa_chat(int nChat){
        HashMap<String, Integer>canaleChat;
        canaleChat=chat.cerca(nChat);
    }

    public void setCanali(Canali canali) {
        this.canali = canali;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }
    
    
}
    
    
