package tests;

public class ExecuteJob {

	public static boolean in = false;

	public static void main(String[] args) throws InterruptedException {
		Task task = new Task();
		task.start();
		Thread.sleep(1000);
		in = true;
		task.join();
	}

	public void run() {
		while (!in) {
			System.out.println(in);
		}
	}

	public static class Task extends Thread {
		public void run() {
			while (!in) {
				System.out.println(in);
			}
		}
	}
}
