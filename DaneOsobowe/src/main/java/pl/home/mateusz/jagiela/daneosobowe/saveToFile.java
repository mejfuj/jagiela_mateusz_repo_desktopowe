/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.home.mateusz.jagiela.daneosobowe;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Mateusz
 */



public class SaveToFile {
    private void saveSettings(){
        try{
           File f = new File("zapis.txt");  
           FileWriter fw = new FileWriter(f);          
            String a = (String) jList1.getText();
            
            fw.write(""+a+"");
            fw.close();
           }catch(IOException e){
            System.out.println("Błąd: "+e.toString());
           }
    }
}
