package tests;

public class MultiThreadedQueue {

	private int[] queue;
	int size;
	int head;
	int tail;
	Boolean full = false;
	Boolean empty = true;

	public MultiThreadedQueue(int size) {
		this.size = size;
		queue = new int[size];
		head = 0;
		tail = 0;
	}

	public synchronized void add(int a) {
		try {
			if (full) {
				System.out.println("Queue Full");
				full.wait();
			}
			queue[tail] = a;
			tail++;
			tail = tail % size;
			empty = false;
			empty.notify();
			if (head == tail) {
				full = true;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public synchronized int remove() throws Exception {
		try {
			if (empty) {
				System.out.println("Queue Empty");
				empty.wait();
			}
			int i = queue[head];
			head++;
			head = head % size;
			full = false;
			full.notify();
			if (head == tail) {
				empty = true;
			}
			return i;

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		throw new Exception("Queue Empty");
	}

}
