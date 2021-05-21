
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
    private Scene scena; 
    private Button[]lista;
    private utente c;
    private VBox v;

    public visualizza_canali(Stage s,utente u) {
        this.s = s;
        c=u;
        lista=new Button[c.getCanali_numero()];
        
        for (int i = 0; i < lista.length; i++) {
            Button b=new Button();
            lista[i]=b;
        }
        v=new VBox();
    }
     public void gui(){
         Canali ca=null;
         for (int i = 0; i < c.getCanali_numero(); i++) {
            ca=c.getcanali(i);
            lista[i].setText(ca.getNome());
            v.getChildren().add(lista[i]);
         }
         StackPane sp=new StackPane(v);
         scena=new Scene(sp,900,750); 
    }
    public Scene getScena(){
       return scena; 
    }
}
