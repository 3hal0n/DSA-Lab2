package lab3;

public class QueueX {
	private int[] queArray;
	private int maxSize;
	private int rear;
	private int front;
	private int nItems;
	
	public QueueX(int s) {
		
		maxSize=s;
		queArray=new int[maxSize];
		rear=-1;
		front=0;
		nItems=0;
	}
	
	public void insert(int j) {
		if(rear==maxSize-1) {
			System.out.println("Queue full");
		}
		else {
			queArray[++rear]=j;
			nItems++;
		}
		
	}
	
	public int remove() {
		if(nItems==0) {
			System.out.println("Error");
			return -99;
		}
		else {
			nItems--;
			return queArray[front++];
		}
	}
	
	public boolean isFull() {
		return nItems==maxSize;
	}
	
	public boolean isEmpty() {
		return nItems==0;
	}
	
}
