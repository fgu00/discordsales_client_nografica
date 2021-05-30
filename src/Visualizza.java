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
    public void sceltaChat() throws IOException, ClassNotFoundException {
        Scanner sc=new Scanner(System.in);
        boolean chat=true;
       boolean ciclo=true;
       while(ciclo==true){
           String canale= ClientDs.in.readLine();
           if(canale!=null){
               System.out.println(canale);
           }else{
               ciclo=false;
           }
       }
        System.out.println("inserisci il numero della chat a cui vuoi accedere");
        String comando=sc.next();
        ClientDs.bw.write(comando);
        
          }
    public void sceltaCategorie() throws IOException{
     Scanner sc=new Scanner(System.in);
        boolean chat=true;
       boolean ciclo=true;
       while(ciclo==true){
           String canale= ClientDs.in.readLine();
           if(canale!=null){
               System.out.println(canale);
           }else{
               ciclo=false;
           }
       }
        System.out.println("inserisci il numero della chat a cui vuoi accedere");
        String comando=sc.next();
        ClientDs.bw.write(comando);
        
          }   
    }
        
        

         


    
    
