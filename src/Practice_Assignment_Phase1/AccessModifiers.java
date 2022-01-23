package Practice_Assignment_Phase1;
class data{
	private String name;
	protected void display() {
		System.out.println("This is the protected modifier");
	}
	
	
	public void number() {
		System.out.println("This is the public modifier" );
		
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	void displayanimal() {
		System.out.println("This is the default modifier");
	}
	
	
}
public class AccessModifiers {

	public static void main(String[] args) {
		data d = new data();
		d.setName("MPHASIS");
		System.out.println(d.getName());
		d.display();
		d.number();
		d.displayanimal();
		
		

	}

}
