
import java.io.BufferedReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author russo.salvatore
 */
public class categorie {
   private String nome;
    private Vector chat=new Vector();
    private ArrayList<utente>persone=new ArrayList<utente>();
    private Socket accedi;
    private int tipologia;
    private OutputStream oi;
    private ObjectOutputStream oo;
    private PrintWriter out;
    private BufferedReader in;  
}
