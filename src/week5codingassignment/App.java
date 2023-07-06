package week5codingassignment;

public class App {
	
	public static void main(String[] args) {
	//Interface left, class name right.
	Logger asteriskLogger = new AsteriskLogger();
	Logger spacedLogger = new SpacedLogger();
	
	System.out.println("\nAsterisk Logger\n");
	asteriskLogger.Log("example");
	
	System.out.println("\nAsterisk Logger ERROR\n");
	asteriskLogger.Error("example");
	
	System.out.println("\nSpaced logger\n");
	spacedLogger.Log("example");
	
	System.out.println("\nSpaced logger ERROR\n");
	spacedLogger.Error("video");
	}
}
