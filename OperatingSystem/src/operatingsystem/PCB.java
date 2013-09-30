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
    //private String processState;
    private int priority;
    private int processSize;
    
    
    public int getUniqueId()
    {
        return uniqueId;
    }
    public void setUniqueId(int value)
    {
        uniqueId = value;
    }
    public int getPriority()
    {
     return priority;   
    }
    public void setPriority(int value)
    {
        priority = value;
    }
    public int getProcessSize()
    {
        return processSize;
    }
    public void setProcessSize(int value)
    {
        processSize = value;
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


