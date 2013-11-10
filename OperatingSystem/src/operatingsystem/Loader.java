
package operatingsystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Loader {

    private MemoryManager mem;
    private PCB pc;
    private BufferedReader in;
    private String[] token;
    private String read;
    private int count;
    private int size;
    private int jobId;
    private int priority;
    private int address;
    private int inputBuffersize;
    private int outputBuffersize;
    private int tempBuffersize;
    
    public MemoryManager getMemory(){
        return this.mem;
    }
    
    public PCB getPCB(){
        return this.pc;
    }

    public Loader() {
        mem = new MemoryManager();
        pc = new PCB();
        jobId = 0;
        size = 0;
        priority = 0;
        address = 0;
        read = "";
        token = new String[1024];
        inputBuffersize = 0;
        outputBuffersize = 0;
        tempBuffersize = 0;
        count = 0;
   
    }

    public boolean BeginLoad() {
        
        try {
            
            in = new BufferedReader(new FileReader("DataFile.txt"));

            while ((read = in.readLine()) != null) {
                
                    if (read.startsWith("// JOB")) {

                    token = read.split(" ");
                    jobId = Integer.parseInt(token[2], 16);
                    size = Integer.parseInt(token[3], 16);
                    priority = Integer.parseInt(token[4], 16);
                    pc.createJob(jobId,size,priority,count);
                    
                    read = in.readLine();
                    
                }

                
                if(read.startsWith("// Data")){
                    
                    token = read.split(" ");
                    inputBuffersize = Integer.parseInt(token[2], 16);
                    outputBuffersize = Integer.parseInt(token[3], 16);
                    tempBuffersize = Integer.parseInt(token[4], 16);
                    pc.addBuffferInfo(inputBuffersize, outputBuffersize, tempBuffersize);
                    
                    read = in.readLine();
                }
                
                                
                mem.writeDiskData(count, read);
                
                count++;
                    

            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                
            } catch (Throwable t) {
                System.exit(1);
            }
        }

        return true;
    }

    
        }
   
