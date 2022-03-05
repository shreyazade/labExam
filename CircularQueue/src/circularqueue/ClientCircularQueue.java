package circularqueue;

import java.util.Scanner;

public class ClientCircularQueue {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		int option=0,value=0;
		CircularQueue cq1 = new CircularQueue();
		do {
			
			System.out.println("***MENU***");
			System.out.println("1.Inatlize a Queue\n2.Enqueue\n3.Dequeue\n4.Display\n0.Exit");
			option=sc.nextInt();
			switch(option)
			{
			case 1:
				cq1.initQueue();
				break;
			case 2:
				System.out.println("Enter the value u want to insert..");
				value=sc.nextInt();
				cq1.enQueue(value);
				break;
			case 3:
				System.out.println("value dequeued:"+cq1.deQueue());
				break;
			case 4:
				cq1.display();
				break;
			case 0:
				System.exit(0);
				break;
				
			}
		}while(option!=0);
		sc.close();
	}}
