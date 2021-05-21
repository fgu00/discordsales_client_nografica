/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;

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
    
    
    
    
}
