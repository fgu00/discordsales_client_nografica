
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author russo.salvatore
 */
public class utente {
    private String nome;
    private String password;
    private String mail;
    private Object immagine;
    private int indirizzo;
    private indirizzo a;
    private ArrayList<Canali>indirizzi_canali=new ArrayList<Canali>();
    
    

public int getCanali_numero(){
 return indirizzi_canali.size();
}
public Canali getcanali(int a){
        return indirizzi_canali.get(a);
    
}
}