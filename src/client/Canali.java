/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.ds;

import java.util.HashMap;



/**
 *
 * @author lorenzotresoldi
 */
public class Canali implements Runnable{
    private HashMap<String, Integer> canali = new HashMap<String, Integer>();

    
    public Canali(HashMap<String, Integer>canali) {
        this.canali=canali;
    }
    


    @Override
    public void run() {
        
    }

    public HashMap<String, Integer> getCanali() {
        return canali;
    }
    
    public int cerca(String nomeCanale){
        return canali.get(nomeCanale);
               
    }
    
    
    
}
