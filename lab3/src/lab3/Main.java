package lab3;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueX mainQueue=new QueueX(5);
		QueueX evenQueue=new QueueX(5);
		QueueX oddQueue=new QueueX(5);
		
		
		Scanner scanner=new Scanner(System.in);
		
		for(int i=1; i<=5; i++) {
			System.out.println("Enter transaction id " +i+ ": ");
			int printerQueue=scanner.nextInt();
			mainQueue.insert(printerQueue);
			
		}
		
		while(!mainQueue.isEmpty()) {
			int transactionId=mainQueue.remove();
			if(transactionId%2==0) {
				evenQueue.insert(transactionId);
			}
			else {
				oddQueue.insert(transactionId);
			}
		}
		
		System.out.println("PC1");
		while(!evenQueue.isEmpty()){
			
			System.out.println("    Transaction "+evenQueue.remove());
		}
		
		System.out.println();
		System.out.println("PC2");
		while(!oddQueue.isEmpty()){
			
			System.out.println("    Transaction "+oddQueue.remove());
		}
		
	}

}
