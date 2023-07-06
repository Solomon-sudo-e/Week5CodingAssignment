package week5codingassignment;

public class SpacedLogger implements Logger {

	@Override
	public void Log(String Log) {
		for (int i = 0; i < Log.length(); i++) {
			System.out.print(Log.charAt(i) + " ");
		}
	}

	@Override
	public void Error(String Error) {
		System.out.print("ERROR: ");
		for (int i = 0; i < Error.length(); i++) {
			System.out.print(Error.charAt(i) + " ");
		}
		
	}

}
