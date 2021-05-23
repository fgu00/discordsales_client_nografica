
import java.io.IOException;
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
}
