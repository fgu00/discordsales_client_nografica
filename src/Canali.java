/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;



/**
 *
 * @author lorenzotresoldi
 */
public class Canali implements Serializable{
        private String nome;
        private int indirizzo;
        private Vector chat=new Vector();
        private Vector categorie=new Vector();
        private ArrayList<utente>persone=new ArrayList<utente>();
        private Object immagine="";
        private indirizzo a=new indirizzo();
        private Socket accedi=new Socket();
        private BufferedReader in;
        private PrintWriter out;
        private Visualizza vs=new Visualizza();

    
  
    

    public String getNome() {
        return nome;
    }
    public String getImmagine(){
            return (String) immagine;  
    }

    public int getIndirizzo() {
        return indirizzo;
    }
    public String ncose(){
            return categorie.size()+":"+chat.size();   
        }
    public String nomechat(int a){
        Chat ch=(Chat) chat.get(a);
            return ch.getNome();
    }
    public String nomecategoria(int a){
        categorie ct=(categorie) categorie.get(a);
            return ct.getNome();  
    }

    public Vector getChat() {
        return chat;
    }

    public Vector getCategorie() {
        return categorie;
    }
    public void azione_canale() throws IOException{
         Scanner sc=new Scanner(System.in);
        boolean ciclo=true;
        while(ciclo==true){
             int comando=sc.nextInt();
            switch(comando){
                case 1:
                    //cambiare nome
                    System.out.println("inserire un nuovo nome");
                    String nome=sc.next();
                     ClientDs.oo.writeObject("1:"+nome);
                    ClientDs.oo.flush();
                    break;
                case 2:
                    //cambiare immagine
                    System.out.println("inserisci la nuova immagine del canale");
                    String immagine=sc.next();
                    ClientDs.oo.writeObject("2:"+immagine);
                    ClientDs.oo.flush();
                    break;
                case 3:
                    //accedere a chat e categorie
                    vs.sceltaCanale();
                    break;
                case 4:
                    //creare una chat
                    
                    
            }
            }
        }
    }
    
    
    
   
    
    
    

