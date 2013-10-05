/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operatingsystem;

/**
 *
 * @author robert
 */
public class PCB
{
	private int processID; //the process's job number
	private int priority; //process priority on a scale of 1-5 (1 being the Highest)
	private int numOfCycles; // job cycle iteration
	private int process_start; //begining memory location of process
	private int process_end; // ending location of process
	private int data_start; //starting location of process data
	private int data_end; //ending location of process data
	private int size; //process size
	private String change_status;		// process status info [running, ready, waiting, new]

//default constructor	
public PCB()
{
 	processID = 0;
	priority = 0;
	numOfCycles = 0;
	size = 0;
	process_start = 0;
	process_end = 0;
	data_start = 0;
	data_end = 0;
	change_status = "";
}
	
public void setProcessID(int pid)
{
	processID = pid;
}
public int getProcessID()
{
	return processID;
}
public void setPriority(int pr)
{
	priority = pr;
}
public int getPriority()
{
	return priority;
}
public void setNumOfCycles(int noc)
{
	numOfCycles = noc;
}
public int getNumOfCycles()
{
	return numOfCycles;
}
public void setSize (int s)
{
	size = s;
}
public int getSize()
{
	return size;
}
public void setProcessStart(int ps)
{
	process_start = ps;
}
public int getProcessStart()
{
	return process_start;
}
public void setProcessEnd(int pe)
{
	process_end = pe;
}
public int getProcessEnd()
{
	return process_end;
}
public void setDataStart(int ds)
{
	data_start = ds;
}
public int getDataStart()
{
	return data_start;
}
public void setDataEnd(int de)
{
	data_end = de;
}
public int getDataEnd()
{
	return data_end;
}

public String getChangeStatus()
{
	return change_status;
}
public void setChangeStatus(String status)
{
	this.change_status = status;
}

public void incrementNumOfCycle()
{
	numOfCycles++;
}

public void changeStatus(String newState)
{
	newState= newState.toLowerCase();
	if(newState.equals("running"))
		change_status = newState;
	else if (newState.equals("ready"))
		change_status = newState;
	else if (newState.equals("waiting"))
		change_status = newState;
	else if (newState.equals("exited"))
		change_status = newState;
	else
		System.out.println("ERROR: "+newState+" is not a valid state");
}
public String toString()
{
	return "process ID: "+processID+"\n priority:"+priority +"\nnumOfcycles:"+numOfCycles+"\nSize:"+size+"\nprocessStart:"+process_start+"\nprocessEnd"+process_end+"\ndata start:"+data_start+"\n data_end:"+data_end+"\nchange status: "+change_status ;
}
}