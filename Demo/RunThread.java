
public class RunThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EvenThread t1 = new EvenThread();
		//t1.run();
		t1.setName("Thread1");
		t1.sleep(1000);
		
		OddThread t2 = new OddThread();
		//t2.run();
		t2.setName("Thread2");
		//t2.sleep(3000);
		
		t1.start();
	
		t2.start();
	
	}

}
