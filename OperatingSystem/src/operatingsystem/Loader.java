/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operatingsystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Loader {

    private Memory mem;
    private PCB pc;
    private BufferedReader in;
    private String read;
    private int length;

    public Loader() {
        mem = new Memory();
        pc = new PCB();
        length = 0;
        read = "";
    }

    public boolean BeginLoad() {
        
        try {
            
            in = new BufferedReader(new FileReader("DataFile.txt"));
            length = mem.get_diskLength();
            //String beginJob = "// JOB";
            //String endJob = "// END";
            //ArrayList<PCB> pcb = new ArrayList<PCB>();

            //NOT sure about this one.  Still workign out best way to parse
            while ((read = in.readLine()) != null) {
                
                

                /*
                if (read.startsWith("// JOB")) {
                    String[] tokens = read.split(" ");
                }
                */

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
