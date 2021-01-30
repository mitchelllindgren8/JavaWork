
public class Owner extends Person {
	
	public Owner (String firstName, String lastName) {
		super(firstName, lastName);
		
	}
	
	public void print() {
		System.out.println("Player details: ");
		super.print();
	}

}
