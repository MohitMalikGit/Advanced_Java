package syncronization;

public class Thread1 extends Thread {
	MathUtil mu;
	Thread1( MathUtil mu){
		this.mu = mu;
	}
	public void run() {
		mu.execute(2);
	}
}
