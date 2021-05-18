
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
    Button[]lista;
    Canali c;

    public visualizza_canali(Stage s) {
        this.s = s;
        l;
    }
     public void gui(){
       
         l=new Label("scena 1");
         lo=new TextField();
         pa=new TextField();
        btn = new Button();
        btn.setText("va alla scena due");
        btn.setOnMouseClicked((value->{
            //imposto la nuova scena
         scena2.getLogin(lo.getText());
         scena2.getPassword(pa.getText());
           s.setScene(scena_2);
           //mostro la scena imposta
           s.show();
        }));
          h.getChildren().addAll(l,btn,lo,pa);
        scena =new Scene(h, 500, 200);  
    }
    
}
