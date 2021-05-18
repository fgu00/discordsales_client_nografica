
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
    //da cambiare perche non so come va salvata l'immaguine
    private Object immagine;
    private int indirizzo;
    private indirizzo a;
    private ArrayList<Canali>indirizzi_canali=new ArrayList<Canali>();   

public ArrayList<Canali> getCanali(){
 return indirizzi_canali;

}
}