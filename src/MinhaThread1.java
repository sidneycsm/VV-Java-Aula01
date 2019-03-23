
public class MinhaThread1 implements Runnable{
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("Primeiro For");
		for (int i =0; i< 10; i++) {
			System.out.println("(1)" + ", " + i);
		}
	}

}
