import java.util.Scanner;

public class Student implements Comparable<Student>, Cafeteria {
	private String name;
	private String surname;
	private int id;
	static int studentCount = 0;
	boolean hasFoodPass;
	
	
	public Student(String name,String surname,int id,boolean hasFoodPass) {
		this.name = name;
		this.surname = surname;
		this.id = id;
		this.hasFoodPass = hasFoodPass;
	}
	
	
	public void DisplayInformation() {
		System.out.println("Name: "+ name);
		System.out.println("Surname: " + surname);
		System.out.println("Id: "+id);
	}
	
	
	@Override
	public int compareTo(Student s) {
		
		return this.id - s.id;
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
			System.out.print("The food is $5. Are you going to pay (y/n): ");
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
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public static int getStudentCount() {
		return studentCount;
	}

	public static void setStudentCount(int studentCount) {
		Student.studentCount = studentCount;
	}
	
}
