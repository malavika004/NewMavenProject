package package1;

public class ExceptionExample {
static int n=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int b[]= {1,2,3};
			System.out.println(b[4]);
		/*int a=n/0;
		System.out.println(a);*/
		}
		catch(ArithmeticException e) {
			System.out.println("Dividion by zero is not possible");
		
	}
	    catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Array Index Out of Bound");
	}
		
		catch(Exception e) {
			System.out.println("Exception"+e); //super class exception.Needs to be given last
		}
		finally {//Whether exception occurs or not, it will always be executed
			System.out.println("Inside finally block");
		}
	System.out.println("Hello");
}

}
