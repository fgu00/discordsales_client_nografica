/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
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
    public void sceltaCanale() throws IOException, ClassNotFoundException {
        boolean chat=true;
        String numeri=canali.ncose();
        String[]quantita=numeri.split(":");
        for (int i = 0; i < Integer.parseInt(quantita[0]); i++) {
            System.out.println(i+" per accedere al canale "+canali.nomechat(i));
        }
        for (int i = 0; i < Integer.parseInt(quantita[1]); i++) {
           System.out.println((i+ Integer.parseInt(quantita[0]))+" per accedere al canale "+canali.nomecategoria(i));  
        }
          int numero=sc.nextInt();
          if(numero> Integer.parseInt(quantita[0])){
              chat=false;
              numero=numero- Integer.parseInt(quantita[0]);
          }
          if(chat==true){
              Chat ch=(Chat) canali.getChat().get(numero);
              ClientDs.bw.write("3:"+ch.getIndirizzo());
              ClientDs.bw.flush();
              ch.azioni_chat();
          }else{
              categorie ct=(categorie) canali.getCategorie().get(numero);
              ClientDs.bw.write("4:"+numero);
              ClientDs.bw.flush();
              ct.azioni_categorie();
              
          }
        }
        

        }  


    
    
