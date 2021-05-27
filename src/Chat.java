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

    public Chat(HashMap<Integer,HashMap<String, Integer>>chat) {
        
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
    public void azioni_chat() throws IOException{
        Scanner sc=new Scanner(System.in);
        boolean ciclo=true;
        while(ciclo==true){
            System.out.println("1 per cambiare nome alla chat");
            System.out.println("2 per scrivere un messaggio");
            int comando=sc.nextInt();
            switch(comando-1){
                case 0:
                 //per cambiare il nome
                    System.out.println("inserisci il nuovo nome da dare alla chat");
                    String nome=sc.next();
                    ClientDs.oo.writeObject("1:"+nome);
                    ClientDs.oo.flush();
                    break;
                case 1:
                    //per scrivere un messaggio
                     ClientDs.oo.writeObject("2:");
                    ClientDs.oo.flush();
                    String messaggio=sc.next();
                     ClientDs.oo.writeObject(messaggio);
                    ClientDs.oo.flush();
                    break;
                case 2:
                    //per stampare 
                    ClientDs.oo.writeObject("3:");
                    ClientDs.oo.flush();
                    break;
                case 3:
                    
            }
        }
    }
    
    
    
}
