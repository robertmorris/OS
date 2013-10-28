/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operatingsystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class OperatingSystem {
    
    public static void main(String[] args) {
      
     MemoryManager memory = new MemoryManager();
     PCB processBlock = new PCB();
     
     Loader loader = new Loader();
     loader.BeginLoad();
     
     memory = loader.getMemory();
     processBlock = loader.getPCB();
        
    }

    
    
}


