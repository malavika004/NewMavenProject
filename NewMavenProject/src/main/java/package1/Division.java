package package1;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Division d1=new Division();
		try {
		System.out.println(	"Answer is:"+d1.division(10,0)); //try catch block is attached along with calling statement

	}
		catch(ArithmeticException e) {
		System.out.println("Division by zero is not possible");
	}
	}
	public int division(int a,int b) throws ArithmeticException { //denoting possibility of error to user
return a/b;
}
}