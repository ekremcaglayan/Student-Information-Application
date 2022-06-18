import java.util.Scanner;

public class PhdStudent extends MasterStudent {

	private int lectureHours;

	public PhdStudent(String name, String surname, int id, boolean hasFoodPass, String thesisName, int lectureHours) {
		super(name, surname,id,hasFoodPass ,thesisName);
		this.lectureHours = lectureHours;
	}
	
	public void DisplayInformation() {
		super.DisplayInformation();
		System.out.println("Lecture Hours: " + lectureHours);
	}

	public int getLectureHours() {
		return lectureHours;
	}

	public void setLectureHours(int lectureHours) {
		this.lectureHours = lectureHours;
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
			System.out.print("The food is $15. Are you going to pay (y/n): ");
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
