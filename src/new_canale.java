


import java.io.IOException;
import java.io.PrintWriter;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author super
 */
public class new_canale {
      private TextField nome ;
       private VBox v;
       private StackPane sp;
       private Button crea;
       private PrintWriter out;
        private Scene scena1=null; 

    public new_canale() throws IOException {
       nome = new  TextField(); 
       v=new VBox();
       sp=new StackPane(v);
       out = new PrintWriter(ClientDs.s.getOutputStream(), true);;
       crea=new Button();
       crea.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
    }
       });
    }
    public void gui(){
     v.getChildren().addAll(nome,crea);
     sp.getChildren().add(v);
     scena1=new Scene(sp,900,750);
    }
    public Scene getScena(){
          return scena1;   
    }
    
        
}
