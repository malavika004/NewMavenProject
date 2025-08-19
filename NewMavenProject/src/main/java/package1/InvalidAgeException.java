package package1;


public class InvalidAgeException extends Exception{ 
String message;

	
	public InvalidAgeException(String message){
		super(message);
		//message is needed to throw message//The Exception class already has a constructor that accepts a message (Exception(String message)).By calling super(message), you are passing your custom message (e.g., "Not eligible for voting") to the parent class.
	}
}

