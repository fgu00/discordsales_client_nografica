
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

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

    public ArrayList<Canali> getIndirizzi_canali() {
        return indirizzi_canali;
    }
    public void interazioni_utente() throws IOException{
        Scanner sc=new Scanner(System.in);
        boolean ciclo=true;
        while(ciclo==true){
            System.out.println("1 per cambiare il nome");
            System.out.println("2 per cambiare password");
            System.out.println("3 per cambiare mail");
            System.out.println("4 per cambiare l'immagine");
            System.out.println("6 per uscire");
            int comando=sc.nextInt();
            switch(comando){
                case 1:
                    System.out.println("inserisci il tuo nuovo nome");
                    String nome2=sc.next();
                    ClientDs.bw.write("1:"+nome2);
                    ClientDs.bw.flush();
                    break;
                case 2:
                    System.out.println("inserisci la tua nuova password");
                    String password=sc.next();
                    ClientDs.bw.write("2:"+password);
                    ClientDs.bw.flush();
                    break;
                case 3:
                    System.out.println("inserisci la tua nuova mail");
                    String mail=sc.next();
                    ClientDs.bw.write("3:"+mail);
                    ClientDs.bw.flush();
                    break;
                case 4:
                    System.out.println("inserisci la tua nuova immagine");
                    System.out.println("si consiglia di usare un solo carattere");
                    String immagine=sc.next();
                    ClientDs.bw.write("4:"+immagine);
                    ClientDs.bw.flush();
                    break;
                case 5:
                    ClientDs.bw.write("5:");
                    ClientDs.bw.flush(); 
                    ciclo=false;
            }
        }
    }

}