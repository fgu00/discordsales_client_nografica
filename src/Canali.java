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
    public void azione_canale() throws IOException, ClassNotFoundException{
         Scanner sc=new Scanner(System.in);
        boolean ciclo=true;
        while(ciclo==true){
            System.out.println("1 per cambiare il nome del canale");
            System.out.println("2 per cambiare l'immagine del canale");
            System.out.println("3 per accedere ad una chat ");
            System.out.println("4 per accedere ad una categoria");
            System.out.println("5 per creare una nuova chat");
            System.out.println("6 per creare una categoria");
            System.out.println("7 per eliminare una chat");
            System.out.println("8 per eliminare una categoria");
            System.out.println("9 per uscire");
             int comando=sc.nextInt();
            switch(comando){
                case 1:
                    //cambiare nome
                    System.out.println("inserire un nuovo nome");
                    String nome=sc.next();
                     ClientDs.bw.println("1:"+nome);
                    ClientDs.bw.flush();
                    break;
                case 2:
                    //cambiare immagine
                    System.out.println("inserisci la nuova immagine del canale");
                    String immagine=sc.next();
                    ClientDs.bw.println("2:"+immagine);
                    ClientDs.bw.flush();
                    break;
                case 3:
                    //accedere a chat 
                    ClientDs.bw.println("3:");
                     ClientDs.bw.flush();
                    vs.sceltaChat();
                    break;
                case 4:
                    //accesso alle categorie
                    ClientDs.bw.println("4:");
                    ClientDs.bw.flush();
                    vs.sceltaCategorie();
                    break;
                case 5:
                    //creare una chat
                    System.out.println("inserisci il nome della nuova chat");
                    String nomec=sc.next();
                    int tipologia=0;
                        System.out.println("0 per mettere la chat publica");
                        System.out.println("1 per mettere la chat private");
                        int comado=sc.nextInt();
                        switch(comado){
                            case 0:
                                tipologia=0;
                                break;
                            case 1:
                                tipologia=1;
                                break;
                        }
                    ClientDs.bw.println("5:"+nomec+":"+tipologia);
                    ClientDs.bw.flush();
                    break;
                case 6:
                    //creare una categoria
                    System.out.println("inserisci il nome della nuova categoria");
                    String nomeg=sc.next();
                    ClientDs.bw.println("6:"+nomeg);
                    ClientDs.bw.flush();
                    break;
                case 7:
                    //eliminare una chat
                    ClientDs.bw.println("7:"); 
                    ClientDs.bw.flush();
                     boolean ciclo3=true;
                     while(ciclo3==true){
                     String canale= ClientDs.in.readLine();
                     if(canale!=null){
                     System.out.println(canale);
                     }else{
                     ciclo=false;
                     }
                     }
                         System.out.println("selezione la chat da eliminare");
                         String scelta=sc.next();
                         ClientDs.bw.println(scelta); 
                         ClientDs.bw.flush();
                         System.out.println(ClientDs.in.readLine());
                    break;
                case 8:
                    //eliminare una categoria
                    ClientDs.bw.println("8:"); 
                    ClientDs.bw.flush();
                     boolean ciclo4=true;
                     while(ciclo4==true){
                     String canale= ClientDs.in.readLine();
                     if(canale!=null){
                     System.out.println(canale);
                     }else{
                     ciclo=false;
                     }
                     }
                         System.out.println("selezione la chat da eliminare");
                         String scelta1=sc.next();
                         ClientDs.bw.println(scelta1); 
                         ClientDs.bw.flush();
                         System.out.println(ClientDs.in.readLine());
                    break;
                case 9:
                  ClientDs.bw.println("9:");  
                   ClientDs.bw.flush();
                    ciclo=false;
                    break;
            }
            }
        }
    }
    
    
    
   
    
    
    

