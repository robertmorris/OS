package operatingsystem;

public class RamMemory {
	
	//array of ram space
	private short[] ram;

    // constructor
    public RamMemory(int s) {      
        ram = new short[s];
    }

    //write data to ram
    public void writeData(int loc, short data) {        
        ram[loc] = data;
    }

    //read data from ram
    public short readData(int i) {
        return ram[i];
    }

  //return a string representation of the ram object
    public String toString() {
        for (int i=0; i<ram.length; i++) {
            System.out.println(ram[i]);
        }
        return ram.toString();
    }

}
