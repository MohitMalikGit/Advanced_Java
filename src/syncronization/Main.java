package syncronization;

public class Main {

	public static void main(String[] args) {
		MathUtil mu = new MathUtil();
		Thread1 th1 = new Thread1(mu);
		Thread2 th2 = new Thread2(mu);
		th1.start();
		th2.start();
	}

}
