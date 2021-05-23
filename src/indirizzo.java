/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author russo.salvatore
 */
public class indirizzo {
   public static int utenti=0;
    public static  int canali=0;
    public indirizzo(){ 
    }
    public int nuovo_canale(){
        canali++;
       return canali; 
    }
    public int nuovo_utente(){
        utenti++;
       return utenti;
    }  
}
