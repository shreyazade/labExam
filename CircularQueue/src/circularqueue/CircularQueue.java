package circularqueue;

import java.util.Scanner;

public class CircularQueue {

	Scanner sc = new Scanner(System.in);
	private int size;
	private int front, rear;
	private int que[];

	public CircularQueue() {
		size = 0;
		front = -1;
		rear = -1;
		que = new int[0];
	}

	public void initQueue() {
		System.out.println("Enter the size of queue");
		size = sc.nextInt();
		que = new int[size];
	}

	public boolean isFull() {

		if (front == -1 && rear == (size-1))
			return true;
		else if (front == (rear + 1) % size)
			return true;
		else
			return false;
	}

	public boolean isEmpty() {
		if (front == rear)
			return true;
		else
			return false;
	}

	public void enQueue(int value) {

		if (!isFull()) {
			rear = (rear + 1) % size;
			que[rear] = value;
		} else
			System.out.println("\tError:Queue is Full");

	}

	public int deQueue() {
		int value = -999;
		if (!isEmpty()) {

			front = (front + 1) % size;
			value = que[front];
		} else
			System.out.println("Queue Is Empty");
		return value;
	}

	public void display() {
		if (!isEmpty()) {
			for (int i = front + 1; i != rear; i = (i + 1) % size) {
				System.out.print("\t" + que[i]);
			}
			System.out.print("\t" + que[rear]);
		} else
			System.out.println("Queue Is Empty.");
	}

}