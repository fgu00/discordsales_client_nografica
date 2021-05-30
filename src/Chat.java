/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author lorenzotresoldi
 */
public class Chat implements Runnable {

    private String nome;
private ArrayList<Object>messaggi;
private int indirizzo;
private ArrayList<String>membri;
private String messaggio;
private Socket accedi;
private PrintWriter out;
private BufferedReader in;
private int tipologia;
private OutputStream oi;
private ObjectOutputStream oo;

    public Chat() {
        
    }
    public String getNome(){
        return nome;  
    }

    @Override
    public void run() {
        
    }

//    public HashMap<Integer, HashMap<String, Integer>> getChat() {
//        return chat;
//    }
//    
//    public HashMap<String, Integer> cerca(int nChat){
//        return chat.get(nChat);
//    }
    
    public void scrivi(){
        
    }
    public int getIndirizzo(){
        return indirizzo;   
    }
    public void azioni_chat() throws IOException{
        Scanner sc=new Scanner(System.in);
        boolean ciclo=true;
        while(ciclo==true){
            System.out.println("1 per cambiare nome alla chat");
            System.out.println("2 per scrivere un messaggio");
            System.out.println("3 per aggiornare");
            System.out.println("4 per invitare un nuovo membro nella chat");
            System.out.println("5 per eliminare un utente");
            System.out.println("6 per uscire");
            
            int comando=sc.nextInt();
            switch(comando){
                case 1:
                 //per cambiare il nome
                    System.out.println("inserisci il nuovo nome da dare alla chat");
                    String nome=sc.next();
                    ClientDs.bw.println("1:"+nome);
                    ClientDs.bw.flush();
                    break;
                case 2:
                    //per scrivere un messaggio
                     ClientDs.bw.println("2:");
                    ClientDs.bw.flush();
                    String messaggio=sc.next();
                     ClientDs.bw.println(messaggio);
                    ClientDs.bw.flush();
                    break;
                case 3:
                    //per stampare 
                     ClientDs.bw.println("3:");
                    ClientDs.bw.flush();
                    boolean ciclo2=true;
                    while(ciclo2==true){
                       String comado=ClientDs.in.readLine();
                       if(comado!=null){
                           System.out.println(comado); 
                       }else{
                           ciclo2=false;
                       }
                    }
                    break;
                case 4:
                    //per invitare un utente nella chat
                    System.out.println("inserisci l'indirizzo ID del utente");
                    String id=sc.next();
                    ClientDs.bw.write("4:"+id);
                    ClientDs.bw.flush();
                    break;
                case 5:
                    //per eliminare un utente da una chat
                      ClientDs.bw.println("5:");
                    ClientDs.bw.flush();
                    boolean ciclo3=true;
                    while(ciclo3==true){
                       String comado=ClientDs.in.readLine();
                       if(comado!=null){
                           System.out.println(comado); 
                       }else{
                           ciclo3=false;
                       }
                    }
                    System.out.println("inserisci l'indirizzo del utente dal eliminare");
                    String id2=sc.next();
                    ClientDs.bw.println(id2);
                    ClientDs.bw.flush();
                    break;
                case 6:
                    //per uscire
                     ClientDs.bw.println("6:");
                    ClientDs.bw.flush();
                    break;
            }
        }
    }
    
    
    
}
