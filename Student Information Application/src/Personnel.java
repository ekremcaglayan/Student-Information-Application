
public class Personnel implements Cafeteria {
	private String name;
	private String surname;
	

	public Personnel(String name,String surname) {
		this.name = name;
		this.surname = surname;
	}


	@Override
	public void serveFood() {
		System.out.print("Serving food for " + getName() + " " + getSurname() + ": ");
		System.out.println("Is a personnel, so food is served");
		System.out.println();	
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}
}
