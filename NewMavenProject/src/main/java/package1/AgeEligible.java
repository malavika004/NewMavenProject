package package1;
import java.util.Scanner;
public class AgeEligible {

	public static void main(String[] args) throws InvalidAgeException {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the age");
 int age=sc.nextInt();
 if(age>=18) {
	 System.out.println("Eligible for voting");
 }
 else {
	 throw new InvalidAgeException("Not eligible for voting");
 }
	}

}
	
	
