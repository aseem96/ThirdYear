package ProcessDetails;

public class ProcessDetails {

	// Bean class
	
    int pid;
    int arrTime;
	int cpuBurst;
	int turnAround;
	int waitTime;
	int cTime;
	int priority;
	
	public ProcessDetails() {
		pid=0;
		arrTime=0;
		cpuBurst=0;
		turnAround=0;
		waitTime=0;
		cTime=0;
		priority=0;
	}
	public ProcessDetails(int p,int a,int c, int t,  int w,int com,int pr) {
		pid=p;
		arrTime=a;
		cpuBurst=c;
		turnAround=t;
		waitTime=w;
		cTime=com;
		priority=pr;
	}
	
	public String toString() {
	    String x = pid + " " + arrTime+ " "+ cpuBurst + " "+cTime+" "+turnAround+" ";
	    x=x+waitTime+" "+priority;
	    return x;
	 
	}
	
	// getters
	
	public int getPid() {
		return pid;
	}
	public int getArrTime() {
		return arrTime;
	}
	public int getCpuBurst() {
		return cpuBurst;
	}
	public int getTurnAround() {
		return turnAround;
	}
	public int getWaitTime() {
		return waitTime;
	}
	public int getCtime() {
		return cTime;
	}
	public int getPriority() {
		return priority;
	}
	
	// setters 
	
	public void setPid(int p) {
		pid = p;
	}
	public void setArrTime(int a) {
		arrTime = a;
	}
	public void setCpuBurst(int c) {
		cpuBurst = c;
	}
	public void setTurnAround(int t) {
		turnAround = t;
	}
	public void setWaitTime(int w) {
		waitTime = w;
	}
	public void setCtime(int c) {
		cTime = c;
	}
	public void setPriority(int p) {
		priority=p;
	}
}
