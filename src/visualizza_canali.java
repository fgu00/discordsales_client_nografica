
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author russo.salvatore
 */
public class visualizza_canali {
   private Stage s;
    private Scene scena1; 
    private Button[]lista;
    private utente c;
    private VBox v;
    private Button nw;
    private new_canale a;
    private Button crea;
    private new_canale nc;
    private Visualizza vis;
    private Canali ca;

    public visualizza_canali() {
        vis=new Visualizza();
        ca=new Canali();
    }

    
    public visualizza_canali(Stage s,utente u) throws IOException {
        this.s = s;
        c=u;
        lista=new Button[c.getCanali_numero()];
        for (int i = 0; i < lista.length; i++) {
            Button b=new Button();
            lista[i]=b;
        }
        v=new VBox();
        nw=new Button();
        a=new new_canale();
        crea=new Button();
        nc=new new_canale();
    }
     public void gui(){
         crea.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                nc.gui();
                ClientDs.scene=scena1;
            }
            });
         Canali ca=null;
         nw.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
             ClientDs.scene=  a.getScena();
            }
            });
         for (int i = 0; i < c.getCanali_numero(); i++) {
            ca=c.getcanali(i);
            lista[i].setText(ca.getNome());
            v.getChildren().add(lista[i]);
         }
         StackPane sp=new StackPane(v);
         scena1=new Scene(sp,900,750); 
    }
    public Scene getScena(){
       return scena1; 
    }
     public void Accedi_canali() throws IOException, ClassNotFoundException{
        Scanner sc=new Scanner(System.in);
        ArrayList<Canali>indirizzi_canali= ClientDs.ac.getIndirizzi_canali();
        for (int i = 0; i < indirizzi_canali.size()-1; i++) {
            System.out.println(i+1+" per accedere al canale "+indirizzi_canali.get(i).getImmagine()+indirizzi_canali.get(i).getNome());  
        }
        System.out.println("inserisci il numero del canale a cui vuoi accedere");
        int numero=sc.nextInt()-1;
        ClientDs.bw.write("3:"+ClientDs.ac.getcanali(numero).getIndirizzo());
        ClientDs.bw.flush();
       ca.azione_canale();
    }
     public void elimina_canale() throws IOException{
         ObjectOutputStream o1=new ObjectOutputStream(ClientDs.s.getOutputStream());
       Scanner sc=new Scanner(System.in);
        ArrayList<Canali>indirizzi_canali= ClientDs.ac.getIndirizzi_canali();
        for (int i = 0; i < indirizzi_canali.size()-1; i++) {
            System.out.println(i+1+" per accedere al canale "+indirizzi_canali.get(i).getImmagine()+indirizzi_canali.get(i).getNome());  
        } 
         System.out.println("inserisci il numero del canale da eliminare");
         int numero=sc.nextInt()-1;
          ClientDs.bw.write("4:"+ClientDs.ac.getcanali(numero).getIndirizzo());
          ClientDs.bw.flush();
         
     }
     
}
