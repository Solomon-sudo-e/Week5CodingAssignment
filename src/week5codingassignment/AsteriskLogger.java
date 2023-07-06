package week5codingassignment;

public class AsteriskLogger implements Logger {

	@Override
	public void Log(String Log) {
		System.out.println("***" + Log + "***");
	}

	@Override
	public void Error(String Error) {
		Error = "Error: " + Error;
		int n = Error.length() + 6;
		String asterisk = "";
		for (int i = 0; i < n; i++) {
			asterisk += "*";
		}
		System.out.println(asterisk);
		System.out.println("\n***" + Error + "***" + "\n");
		System.out.println(asterisk);
		
	}
	
}
