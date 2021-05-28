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
            System.out.println("3 per accedere ad una chat o ad una categoria");
            System.out.println("4 per creare una nuova chat");
            System.out.println("5 per creare una categoria");
            System.out.println("6 per eliminare una chat");
            System.out.println("7 per eliminare una categoria");
            System.out.println("8 per uscire");
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
                    System.out.println("inserisci il nome della nuova chat");
                    String nomec=sc.next();
                    int tipologia=0;
                    boolean ciclo2=true;
                    while(ciclo2=true){
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
                        
                    }
                    ClientDs.oo.writeObject("5:"+nomec+":"+tipologia);
                    ClientDs.oo.flush();
                    break;
                case 5:
                    //creare una categoria
                    System.out.println("inserisci il nome della nuova categoria");
                    String nomeg=sc.next();
                    ClientDs.oo.writeObject("6:"+nomeg);
                    ClientDs.oo.flush();
                    break;
                case 6:
                    //eliminare una chat
                    for (int i = 0; i < chat.size(); i++) {
                        Chat ca=(Chat) chat.get(i);
                        System.out.println(i+" per eliminare la chat "+ca.getNome());   
                    }
                int numero=sc.nextInt();
                ClientDs.oo.writeObject("7:"+numero);
                ClientDs.oo.flush();
                    String m=(String) ClientDs.o.readObject();
                    if(m.equals("")){
                        System.out.println("chat eliminata con sucesso");
                    }
                    break;
                case 7:
                    //eliminare una categoria
                    for (int i = 0; i < categorie.size(); i++) {
                        categorie ca=(categorie) categorie.get(i);
                        System.out.println(i+" per eliminare la categoria "+ca.getNome());   
                    }
                int numero2=sc.nextInt();
                ClientDs.oo.writeObject("8:"+numero2);
                ClientDs.oo.flush();
                    String m2=(String) ClientDs.o.readObject();
                    if(m2.equals("")){
                        System.out.println("categoria eliminata con sucesso");
                    }
                    break;
                case 8:
                  ClientDs.oo.writeObject("9:");    
                    ciclo=false;
            }
            }
        }
    }
    
    
    
   
    
    
    

