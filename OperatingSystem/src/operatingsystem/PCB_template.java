/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package operatingsystem;

/**
 *
 * @author overload
 */
class PCB_template {
    //Jobs attributes
    private int id;
    private int size;
    private int priority;
    private int address;
   
    //
    private int iBufferSize;
    private int oBufferSize;
    private int tBufferSize;
    private int dataSize;
    private int status;
    
    //array of input/output/temporary buffer sizes
    private short[] IP_buffer;
    private short[] OP_buffer;
    private short[] TMP_buffer;

    //accounting information
    private long iQueueTime = 0;
    private long oQueueTime = 0;
    private long cpuStartTime = 0;
    private long cpuEndTime = 0;
    
    //process state
    private final int READY = 0;
    private final int FINISHED = 1;
    private final int LOADED = 2;
    private final int WAITING = 3;
    
    private int memStart;
    private int memEnd;
    
    //Constructor
    public PCB_template(int id, int size, int priority, int address){
    	this.id = id;
    	this.size = size;
    	this.priority = priority;
    	this.address = address;
    }
    
    //
    public void addMetaData(int iBufferSize, int oBufferSize, int tBufferSize) {
        this.iBufferSize = iBufferSize;
        this.oBufferSize = oBufferSize;
        this.tBufferSize = tBufferSize;
        
        //store the sizes in an array
        this.IP_buffer = new short[iBufferSize];
        this.OP_buffer = new short[oBufferSize];
        this.TMP_buffer = new short[tBufferSize];
    }

/*************** Getters and Setters**************************/
    public void setDataSize(int dataSize) {
        this.dataSize = dataSize;
    }
    
    public int getDataSize() {
        return this.dataSize;
    }
    
    public void setCPUBuffer(short[] IP_buffer) {
        this.IP_buffer = IP_buffer;
    }
    
    public void setOPBuffer(short[] OP_buffer) {
        this.OP_buffer = OP_buffer;
    }
    
    public void setTMPBuffer(short[] TMP_buffer) {
        this.TMP_buffer = TMP_buffer;
    }
    
    public short[] getCPUBuffer() {
        return this.IP_buffer;
    }
    
    public short[] getOPBuffer() {
        return this.OP_buffer;
    }
    
    public short[] getTMPBuffer() {
        return this.TMP_buffer;
    }
    
    public int getID() {
        return this.id;
    }

    public int getPriority() {
        return this.priority;
    }
    
    public int getSize() {
        return this.size;
    }
    
    public int getStatus() {
        return this.status;
    }
    
    public int getAddress() {
        return this.address;
    }
    
    public void setAddress(int address) {
        this.address = address;
    }
    
    //set the status of a process
    public Boolean setStatus(int status) {
        if (status == READY || status == FINISHED) {
            this.status = status;
            return true;
        }
        return false;
    }
    
    public int getIBufferSize() {
        return this.iBufferSize;
    }
    
    public int getOBufferSize() {
        return this.oBufferSize;
    }
    
    public int getTBufferSize() {
        return this.tBufferSize;
    }
    
    public void terminate(int s) {
        this.status = s;
    }
    
    public void setMemStart(int memStart) {
        this.memStart = memStart;
    }
    
    public int getMemStart() {
        return this.memStart;
    }
    
    public void setMemEnd(int memEnd) {
        this.memEnd = memEnd;
    }
    
    public int getMemEnd() {
        return this.memEnd;
    }
    
    public void setCpuEndTime(long cpuEndTime) {
        this.cpuEndTime = cpuEndTime;
    }
    
    public void setCpuStartTime(long cpuStartTime) {
        this.cpuStartTime = cpuStartTime;
    }
    
    public void setIQueueTime(long iQueueTime) {
        this.iQueueTime = iQueueTime;
    }
    
    public void setOQueueTime(long oQueueTime) {
        this.oQueueTime = oQueueTime;
    }
    
    public long getCpuEndTime() {
        return this.cpuEndTime;
    }
    
    public long getCpuStartTime() {
        return this.cpuStartTime;
    }
    
    public long getIQueueTime() {
        return this.iQueueTime;
    }
    
    public long getOQueueTime() {
        return this.oQueueTime;
    }

}
