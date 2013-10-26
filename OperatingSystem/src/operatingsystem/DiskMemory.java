package operatingsystem;

public class DiskMemory {
	
	//array of disk space
	private String[] disk;

	//constructor
    public DiskMemory(int s) {
        disk = new String[s];

    }

    //write data to the disk
    public void writeData(int loc, String data) {        
        disk[loc] = data;
    }

    //read data from the disk
    public String readData(int i) {       
        return disk[i];
        
    }
    //return a string representation of the disk object
    public String toString() {
        System.out.println( disk.toString() );
        return disk.toString();
    }
}


