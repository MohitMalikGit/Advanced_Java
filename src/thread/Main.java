package thread;

public class Main {

	public static void main(String[] args) {
		for( int i = 0 ;i  < 5; i++) {
			Thread1 th1 = new Thread1();
			th1.start();
			Thread th2 = new Thread(new Thread2());
			th2.start();
			System.out.println();
		}
	}

}
