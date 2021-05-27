/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author lorenzotresoldi
 */

//realizzare gui

public class Visualizza {
    private Canali canali;
    private Chat chat;
    private Scanner sc=new Scanner(System.in);
    

    public Visualizza(Canali canali, Chat chat) {
        this.canali = canali;
        this.chat = chat;
    }
    public Visualizza(){
        
    }
    
    public void stampa_canale(String nomeCanale){
      
    }
    
    public void stampa_chat(int nChat){
        
    }

    public void setCanali(Canali canali) {
        this.canali = canali;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }
    public void setcanale(Canali ca){
       canali=ca;
    }
     //chat
    public void sceltaCanale() {
        String numeri=canali.ncose();
        String[]quantita=numeri.split(":");
        for (int i = 0; i < Integer.parseInt(quantita[0]); i++) {
            System.out.println(i+" per accedere al canale "+canali.nomechat(i));
        }
        for (int i = 0; i < Integer.parseInt(quantita[1]); i++) {
           System.out.println((i+quantita[0])+" per accedere al canale "+canali.nomecategoria(i));  
        }
          int numero=sc.nextInt();
          
        }
        

        }  


    
    
