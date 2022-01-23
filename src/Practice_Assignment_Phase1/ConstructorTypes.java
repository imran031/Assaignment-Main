package Practice_Assignment_Phase1;

public class ConstructorTypes {

	public static void main(String[] args) {
		new constructor();
		new constructor("Asif");
		new constructor("IMRAN",'A');
		new constructor("IRFAN",'B',248);

		}

	}

	class constructor{
		public constructor() {                //Zero constructor
			System.out.println("disply constructor");
		}
		public constructor(String name) {     //Parameterized constructor
			System.out.println("the User name :"+name);
		}
		// constructor Overloaded 
		public constructor(String name,char sec) {       
			System.out.println("Employee name :"+name+"\nsection :"+sec);
		}
		public constructor(String name,char sec,int id) {
			System.out.println("Employee name :"+name+"\nsection :"+sec+"\nEmploy ID :"+id);
		}
	}

	

