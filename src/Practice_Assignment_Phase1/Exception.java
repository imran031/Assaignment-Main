package Practice_Assignment_Phase1;

public class Exception {

	public static void main(String[] args) {
        int[] array = new int[5];
        try 
        {
            array[7] = 5;
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array index is out of bounds"); 
        }
        finally 
        {
            System.out.println("The size of the array is " + array.length);
        }


	}

}
