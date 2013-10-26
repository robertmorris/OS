/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operatingsystem;

import java.util.HashMap;


/**
 *
 * @author scoobydoo
 */



public class Memory {

    private String[] Ram;	//simulated ram space
    private String[] Disk; //simulated disk 
    HashMap ProcessData; //jobs to add to hashmap
    private int size; //size of the Hash map

    public Memory() {
        
        Ram = new String[2048];
        Disk = new String[2048];
        ProcessData = new HashMap();
        size = 0;
    }

    public void set_Size(int s) {
        size = s;
    }

    public int get_Size() {
        return size;
    }

    public void set_ramLoc(int i, String r) {
        Ram[i] = r;
    }

    public String get_ramLoc(int i) {
        return Ram[i];
    }

    public int get_ramLength() {
        return Ram.length;
    }

    public void set_diskLoc(int i, String d) {
        Disk[i] = d;
    }

    public String get_diskLoc(int i) {
        return Disk[i];
    }

    public int get_diskLength() {
        return Disk.length;
    }

    public boolean add_PCB(PCB data)
    {
        boolean value = false;
        for (int i = 0; i < ProcessData.size(); i++) {
            if (!ProcessData.isEmpty()) {
                ProcessData.put(size,data);
                value = true;
            }
        }
        return value;
    }

    /*public PCB getNext()
     {
     PCB data = null;
	
     }
     */
}
