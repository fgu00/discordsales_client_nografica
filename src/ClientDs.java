/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    public static visualizza_canali scena1;
    public static Scene scene;
    public static Socket s = null;
    public static  PrintWriter out = null;
    public static  BufferedReader in=null;
    public static InputStream FI = null;
    public static ObjectInputStream o = null;
    public static utente ac=null;
    public static  ObjectOutputStream oo =null;
     public static PrintWriter bw=null;
    
    @Override
    public void start(Stage primaryStage) throws IOException {
//         s = new Socket("127.0.0.1",20);
//        TextField nome1 =  new TextField();
//        TextField password1;
//        Label nome = new Label();
//        Label password = new Label();
//        Label nomeapp = new Label();
//        Label verifica =new Label(); 
//        Button btn = new Button();
//        btn.setText("accedi");
//        btn.setAlignment(Pos.CENTER_RIGHT);
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                try {
//                    out = new PrintWriter(s.getOutputStream(), true);
//                    in = new BufferedReader(new InputStreamReader(s.getInputStream()));
//                    FI = s.getInputStream();
//                    o = new ObjectInputStream(FI);
//                    utente ac=null;
//                    System.out.println("uuuuu");
//                    out.write("1:"+nome1.getText()+":"+password.getText());
//                    out.flush();
//                    ac=(utente)o.readObject();
//                    if(ac==null){
//                        verifica.setText("utente inesistente");
//                    }else{
//                      scena1.gui();
//                    scene=scena1.getScena();   
//                    }
//                } catch (IOException ex) {
//                    Logger.getLogger(ClientDs.class.getName()).log(Level.SEVERE, null, ex);
//                } catch (ClassNotFoundException ex) {
//                    Logger.getLogger(ClientDs.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            
//        }
//        });
//        nome.setText("nome: ");
//        password.setText("password: ");
//        password1 = new TextField();
//        Hyperlink link = new Hyperlink();
//        link.setText("non sei ancora registrato, registrati !!");
//        link.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent e) {
//                System.out.println("This link is clicked");
//            }
//        });
//        VBox vbox = new VBox(nome, nome1, password, password1, btn, link,verifica);
//        vbox.setPadding(new Insets(300, 50, 50, 50));
//        scene = new Scene(vbox, 900,750);
//        primaryStage.setScene(scene);
//            primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws  ClassNotFoundException {
        try {
             s = new Socket("127.0.0.1",20);
             OutputStream versoIlClient = s.getOutputStream();
                 bw = new PrintWriter(  new OutputStreamWriter(versoIlClient),true);
                 in = new BufferedReader( new InputStreamReader(s.getInputStream()));
            Scanner sc=new Scanner(System.in);
            visualizza_canali vc=new visualizza_canali();
            utente u=new utente();
            boolean ciclo=true;
            while(ciclo==true){
                try {
                    System.out.println("1 per creare un nuovo account");
                    System.out.println("2 per accedere");
                    int scelta=sc.nextInt();
                    switch(scelta-1){
                        case 0:
                            //accedi per la prima volta
                            System.out.println("inserisci un nome");
                            String nome=sc.next();
                            System.out.println("inserisci una password");
                            String password=sc.next();
                            System.out.println("inserisci una mail");
                            String mail=sc.next();
                            String immagine=""+nome.charAt(0);
                            bw.println("0:"+nome+":"+password+":"+mail+":"+immagine);
                            bw.flush();
                            String m=in.readLine();
                            System.out.println(m);
                            boolean ciclo2=true;
                            while(ciclo2==true){
                                System.out.println("1 per creare un nuovo canale");
                                System.out.println("2 per accedere ad un canale");
                                System.out.println("3 per eliminare un canale");
                                System.out.println("4 per cambiare le impostazione del utente");
                                System.out.println("5 per uscire");
                                int a=sc.nextInt();
                                switch(a){
                                    case 1:
                                        //per creare un canale
                                        System.out.println("inserici il nome del nuovo canale");
                                        String nome2=sc.next();
                                        bw.println("2:"+nome2);
                                        bw.flush();
                                        m=in.readLine();
                                        System.out.println(m);
                                        break;
                                    case 2:
                                        //accedi ai canali
                                        bw.println("3:");
                                            bw.flush();
                                        vc.Accedi_canali();
                                        break;
                                    case 3:
                                        //eliminare un canale
                                         bw.println("4:");
                                            bw.flush();
                                        vc.elimina_canale();
                                        break;
                                    case 5:
                                        //uscire
                                        bw.println("6:");
                                        ciclo2=false;
                                        ciclo=false;
                                        break;
                                    case 4:
                                        //
                                        bw.println("5:");
                                        bw.flush();
                                        u.interazioni_utente();
                                        break;
                                }
                            }
                            break;
                        case 1:
                            //accedi se hai giua un account
                            System.out.println("inserisci il tuo nome");
                            String nome1=sc.next();
                            System.out.println("inserisci la tua password");
                            String password1=sc.next();
                            System.out.println("nserisci la tua mail");
                            String mail1=sc.next();
                            bw.println("1:"+nome1+":"+password1+":"+mail1);
                            bw.flush();
                            String p=in.readLine();
                            if(p.equals("0")){
                                System.out.println("utente inesistente");
                            }else{
                              m=in.readLine();
                                System.out.println(m);
                                boolean ciclo3=true;
                                while(ciclo3==true){
                                    System.out.println("1 per creare un nuovo canale");
                                    System.out.println("2 per accedere ad un canale");
                                    System.out.println("3 per eliminare un canale");
                                    System.out.println("4 per cambiare le impostazione del utente");
                                     System.out.println("5 per uscire");
                                     System.out.println("ccc");
                                    int a=sc.nextInt();
                                    switch(a){
                                        case 1:
                                            //per creare un canale
                                            System.out.println("inserici il nome del nuovo canale");
                                            String nome2=sc.next();
                                            bw.println("2:"+nome2);
                                            bw.flush();
                                             m=in.readLine();
                                        System.out.println(m);
                                           // ac=(utente) o.readObject();
                                            break;
                                        case 2:
                                            //accedi ai canali
                                            bw.println("3:");
                                            bw.flush();
                                            vc.Accedi_canali();
                                            break;
                                        case 3:
                                            //eliminare un canale
                                            bw.println("4:");
                                            bw.flush();
                                            vc.elimina_canale();
                                            //ac=(utente) o.readObject();
                                            break;
                                        case 5:
                                            //uscire
                                            bw.println("6:");
                                            bw.flush();
                                            ciclo3=false;
                                            ciclo=false;
                                            break;
                                            case 4:
                                        bw.write("5:");
                                        bw.flush();
                                        u.interazioni_utente();
                                        break;
                                    }
                                    
                                    
                                }
                                
                            }
                    }      } catch (IOException ex) {
                        Logger.getLogger(ClientDs.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
        } catch (IOException ex) {
            Logger.getLogger(ClientDs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
