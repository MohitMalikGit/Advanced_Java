package syncronization;

public class Thread2 extends Thread {
	MathUtil mu;
	Thread2( MathUtil mu){
		this.mu = mu;
	}
	public void run() {
		mu.execute(3);
	}
}
