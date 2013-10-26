/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operatingsystem;

import java.util.Stack;

/**
 *
 * @author robert
 */
public class PCB
{
		//stacks of processes
    private static Stack<PCB_template> jobQueue;
    private PCB_template pcb;
    private static int count;
    
    //constructor
    public PCB() {
        count = 0;
        jobQueue = new Stack<PCB_template>();
    }
    
    //creates and pcb_template object & add to the job queue, once buffer information is added
    public void createJob(int id, int size, int priority, int address) {
        pcb = new PCB_template(id, size, priority, address);
    }
    
    public void addBuffferInfo(int iBufferSize, int oBufferSize, int tBufferSize) {
        pcb.addMetaData(iBufferSize, oBufferSize, tBufferSize);
        jobQueue.add(pcb);
        count++;
    }
    
    public void setDataSize(int dataSize) {
        pcb.setDataSize(dataSize);
    }
    
    public int getCount() {
        return count;
    }
    
    public PCB_template getJob(int i) {
        return jobQueue.get(i);
    }
    
   // Remove a job from the job queue
    public void removeJob(int i) {
        jobQueue.remove(i);
    }

    public void printPCB() {

        //System.out.println(jobQueue.toString());
        for (PCB_template v : jobQueue) {
            System.out.println("JobID: " + v.getID() + "\tJobPriority: " +
                    v.getPriority() + "\tJobSize: " + v.getSize());
        }
    }
}