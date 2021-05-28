
import java.io.BufferedReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author russo.salvatore
 */
public class categorie {
   private String nome;
    private Vector chat=new Vector();
    private ArrayList<utente>persone=new ArrayList<utente>();
    private Socket accedi;
    private int tipologia;
    private OutputStream oi;
    private ObjectOutputStream oo;
    private PrintWriter out;
    private BufferedReader in;  
    
    public String getNome(){
       return nome;  
    }
    public void azioni_categorie() throws IOException, ClassNotFoundException{
        Scanner sc=new Scanner(System.in);
        boolean ciclo=true;
         while(ciclo=true){
        System.out.println("MENU");
        System.out.println("1. cambia nome");
        System.out.println("2. aggiungi chat");
        System.out.println("3. elimina chat");
        System.out.println("4. accedi ad una chat");
        System.out.println("5. ESCI");
        int a=sc.nextInt();
        switch(a){
            case 1:
                //cambiare nome
                System.out.println("inserisci nuovo nome");
                String nome=sc.next();
                ClientDs.oo.writeObject("1:"+nome);
                ClientDs.oo.flush();
                break;
            case 2:
                //per creare una nuova chat
                 System.out.println("inserisci il nome della nuova chat");
                    String nomec=sc.next();
                    int tipologia=0;
                    boolean ciclo2=true;
                    while(ciclo2=true){
                        System.out.println("0 per mettere la chat publica");
                        System.out.println("1 per mettere la chat private");
                        int comando=sc.nextInt();
                        switch(comando){
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
            case 3:
                //per eliminare una chat
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
            case 4:
                for (int i = 0; i < chat.size(); i++) {
                    Chat ht=(Chat) chat.get(i);
                    System.out.println(i+" per accedere alla chat "+ht.getNome());
                }
                 int numero1=sc.nextInt();
                 Chat ch=(Chat)chat.get(numero1);
              ClientDs.out.write("4:"+ch.getIndirizzo());
              ClientDs.out.flush();
              ch.azioni_chat();
                break;
            case 5:
               //uscire
                ciclo=false;
                 ClientDs.out.write("5:");
              ClientDs.out.flush();
                break;
        }
    }
    }

    
}
