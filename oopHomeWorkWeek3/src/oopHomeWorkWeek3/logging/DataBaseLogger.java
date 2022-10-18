package oopHomeWorkWeek3.logging;

public class DataBaseLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Veritabanına lognalndı "+data);
	}

}
