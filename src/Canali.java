/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.Serializable;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
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

    
  
    

    public String getNome() {
        return nome;
    }
    
   
    
    
    
}
