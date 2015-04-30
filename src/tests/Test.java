package tests;





public class Test {
	public static void main(String... args) throws Exception {
		MultiThreadedQueue mtq = new MultiThreadedQueue(3);
		mtq.add(1);
		mtq.add(2);
		mtq.add(3);
		System.out.println(mtq.remove());		
		mtq.add(4);
		mtq.add(1);
		mtq.add(1);
		System.out.println(mtq.remove());
		System.out.println(mtq.remove());
		System.out.println(mtq.remove());
		mtq.add(1);
		mtq.add(2);
		mtq.add(3);
		System.out.println(mtq.remove());		
		mtq.add(4);
		mtq.add(1);
		mtq.add(1);

	}

	

}
