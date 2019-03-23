
public class MinhaThread2 implements Runnable {
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("Segundo For");
		for (int i =0; i< 10; i++) {
			System.out.println("(2)" + ", " + i);
		}
	}

}
