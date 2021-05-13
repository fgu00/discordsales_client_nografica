/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.ds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.net.Socket;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author lorenzotresoldi
 */
public class ClientDs extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Label nome = new Label();
        Label password = new Label();
        Label nomeapp = new Label();
        Button btn = new Button();
        btn.setText("accedi");
        btn.setAlignment(Pos.CENTER_RIGHT);
        nome.setText("nome: ");
        password.setText("password: ");
        TextField nome1 = new TextField();
        TextField password1 = new TextField();
        Hyperlink link = new Hyperlink();
        link.setText("non sei ancora registrato, registrati !!");
        link.setOnAction(new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent e) {
        System.out.println("This link is clicked");
    }
});
        
        VBox vbox = new VBox(nome, nome1, password, password1, btn, link);
        vbox.setPadding(new Insets(300, 50, 50, 50));
        Scene scene = new Scene(vbox, 900,750);
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                String userName=nome1.getText();
                String password=password1.getText();     
                // chiamata di funzione per controllare username e password
            }
        });
        
        
        
        
      
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("10.1.33.31",20);
        String a;
        
            PrintWriter out
                    = new PrintWriter(s.getOutputStream(), true);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(s.getInputStream()));
           
        
            out.println("1:String nome: passowrd ps:mail @mail: String a");
            out.flush();
              out.write("1:String nome: passowrd ps:mail @mail: String a");
              out.flush();
                out.write("1:String nome: passowrd ps:mail @mail: String a");
                out.flush();
                  out.write("1:String nome: passowrd ps:mail @mail: String a");
                  out.flush();
                    out.write("1:String nome: passowrd ps:mail @mail: String a");
                      out.write("1:String nome: passowrd ps:mail @mail: String a");
                        out.write("1:String nome: passowrd ps:mail @mail: String a");
                          out.write("1:String nome: passowrd ps:mail @mail: String a");
                    
                
            
    }
    
}
