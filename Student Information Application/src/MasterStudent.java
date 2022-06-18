import java.util.Scanner;

public class MasterStudent extends Student {

	private String thesisName;

	public MasterStudent(String name, String surname, int id, boolean hasFoodPass, String thesisName) {
		super(name, surname,id,hasFoodPass);
		this.thesisName = thesisName;
	}
	
	public void DisplayInformation() {
		super.DisplayInformation();
		System.out.println("Thesis Name: " + thesisName);
	}

	public String getThesisName() {
		return thesisName;
	}

	public void setThesisName(String thesisName) {
		this.thesisName = thesisName;
	}
	
	@Override
	public void serveFood() {
		System.out.print("Serving food for " + getName() + " " + getSurname() + ": ");
		if (hasFoodPass == true) {	
			System.out.println("Has a food coupon, food is served.");
			System.out.println();
		} else {
			Scanner myscanner = new Scanner(System.in);
			System.out.println("Does not have a food coupon.");
			System.out.print("The food is $10. Are you going to pay (y/n): ");
			String payment = myscanner.nextLine();
			if (payment.equals("y")) {
				System.out.println("Food is served");
				System.out.println();
			}else {
				System.out.println("Food is not served.");
				System.out.println();
			}
		}		
	}
}
