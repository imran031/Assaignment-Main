package Practice_Assignment_Phase1;

public class MethodReturnTypes {

	public static void main(String[] args) {
		Methods ref =new Methods();
		System.out.println("Addition of numbers :"+ref.AddsMethod(5, 5));;
		System.out.println(ref.Operation(1));
		ref.multiple(5, 2);
		ref.multiple(10.5f,2, 3);
		ref.multiple(3, 3, 3);
	}
}
class Methods{
	public int AddsMethod(int n1,int n2) { // method demo
		return n1+n2;
	}
	// Call Method 
	int val = 100;
	public int Operation(int val) {
		val =val*10;
		return val;
	}
	// Method Overloading
	public void multiple(int n1,int n2) {
		System.out.println("Multiple of two numbers :"+(n1*n2));
	}
	public void multiple(int n1,int n2,int n3) {
		System.out.println("Multiple of two numbers :"+(n1*n2*n3));
	}
	public void multiple(float n1,int n2,int n3) {
		System.out.println("Multiple of two numbers :"+(n1*n2*n3));
	}
	
	}


