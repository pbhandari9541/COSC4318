public class Thre extends Thread{
	public void run(){
		for(int i = 100; i<120; i++){
			System.out.println(i);
			try {
			    Thread.sleep(1000);                 //1000 milliseconds is one second.
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
		}

	}

}