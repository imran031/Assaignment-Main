package Practice_Assignment_Phase1;

public class TryCache {

	public static void main(String[] args) {
		
		int a,b,c;
		a=8;
		b=0;
		try
		{
			c=a/b;
		}
		catch(ArithmeticException ae)
		{
		System.out.println("Can't divide the number by zero ");
		}

		

	}

}
