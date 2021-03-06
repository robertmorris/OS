package operatingsystem;

public class MemoryManager {
	
    public DiskMemory disk;
    private RamMemory ram;


    /*************************************************************
        The contents of the disk and RAM are hex characters; 
        and of sizes 2048 and 1024 words, respectively. (Each word
        is 4 bytes or 8 hex characters long.)  
    **************************************************************/
    
    public MemoryManager() {
        disk = new DiskMemory(4096);
        ram = new RamMemory(2048);
    }

    //writes the given data to the disk starting at the location provided.  
    public synchronized void writeDiskData(int loc, String data) {
        disk.writeData(loc, data);
    }

    // Returns a string representation of the hex code
    public synchronized String readDiskData(int r) {
        return disk.readData(r);
    }
 
    public synchronized void writeRamData(int loc, short data) {
        ram.writeData(loc, data);        
    }
  
    public synchronized short readRamData(int r) {
        return ram.readData(r);
    }

    public String printDisk() {
        return disk.toString();
    }

    public String printRam() {
        return ram.toString();
    }
}

