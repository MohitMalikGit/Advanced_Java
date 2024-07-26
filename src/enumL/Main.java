package enumL;


public class Main {

	public static void main(String[] args) {
		Week_days day = Week_days.MON;
		for( Week_days da : Week_days.values()) {
			System.out.println(da.val);
		}
		
	}

}
