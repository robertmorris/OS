

package operatingsystem;

import java.util.Stack;


public class DriverClass {
    
    Loader loader = new Loader();
    MemoryManager memory = new MemoryManager();
    PCB pc = new PCB();
    
    
      
     public DriverClass()
     {
        loader.BeginLoad();
        memory = loader.getMemory();
        pc = loader.getPCB();
        
        CPU(pc);
        
        
     }

    private void CPU(PCB pc) {
        
    }

    

    

    
}
