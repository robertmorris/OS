/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operatingsystem;

/**
 *
 * @author robert
 */
public class PCB {
    
    private static int sharedUniqueId = 0;
    private int uniqueId;
    //private enum processState {newCPU, running, ready, waiting, terminated }
    private String processState;
    private int priority;
    private int processSize;
    
    
    public int getUniqueId()
    {
        return uniqueId;
    }
    
    
    PCB(){
        uniqueId = ++sharedUniqueId;
        
    }
  
    public class Registers{
    
        private String xar;
        private String xdi;
        private String xdo;
        private String pc;
        
        Registers(){
            
        }
  
    }
    
}


