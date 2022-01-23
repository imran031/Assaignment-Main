package Practice_Assignment_Phase1;

public class InnerClassAssisted {
 private String msg="Welcome to Java"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
	 }  


	public static void main(String[] args) {

		InnerClassAssisted obj=new InnerClassAssisted();
		InnerClassAssisted.Inner in=obj.new Inner();  
		in.hello();  
	}

	

}




