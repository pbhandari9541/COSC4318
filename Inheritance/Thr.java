public class Thr extends Thread{
	public void run(){
		for(int i = 1; i<20; i++){
			System.out.println(i);
			try {
			    Thread.sleep(1000);                 //1000 milliseconds is one second.
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
		}

	}

}