import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		
		ArrayList<Student> std = new ArrayList<Student>();
		ArrayList<Cafeteria> cft = new ArrayList<Cafeteria>();
		
		Scanner sc = new Scanner(System.in);
		int choice = 0;

		
		while(true) {			
			
			try 
			{	
				for (Menu a : Menu.values()) {
					System.out.println(a.getItem());
					
				}
				choice = sc.nextInt();
				
				Scanner myscanner = new Scanner(System.in);
				if (choice == 1) {
					System.out.println();
					System.out.print("Name: ");
					String name = myscanner.nextLine();
					System.out.print("Surname: ");
					String surname = myscanner.nextLine();
					System.out.print("ID: ");
					int id = myscanner.nextInt();
					myscanner.nextLine();
					System.out.print("Does the student have food pass (y/n): ");
					String hasFoodPassStr = myscanner.nextLine();
					boolean hasFoodPass = false;
					if (hasFoodPassStr.equals("y")) {
						hasFoodPass = true;
					}
					std.add(new Student(name,surname,id, hasFoodPass));
					cft.add(new Student(name,surname,id, hasFoodPass));
					Student.studentCount++;
					System.out.println();
				}else if (choice == 2) {
					System.out.println();
					System.out.print("Name: ");
					String name = myscanner.nextLine();
					System.out.print("Surname: ");
					String surname = myscanner.nextLine();
					System.out.print("ID: ");
					int id = myscanner.nextInt();
					myscanner.nextLine();
					System.out.print("Does the student have food pass (y/n): ");
					String hasFoodPassStr = myscanner.nextLine();
					boolean hasFoodPass = false;
					if (hasFoodPassStr.equals("y")) {
						hasFoodPass = true;
					}
					System.out.print("Thesis Name: ");
					String thesisName = myscanner.nextLine();
					std.add(new MasterStudent(name,surname,id,hasFoodPass,thesisName));
					cft.add(new MasterStudent(name,surname,id,hasFoodPass,thesisName));
					Student.studentCount++;
					System.out.println();
				}else if (choice == 3) {
					int lectureHours = 0;
					System.out.println();
					System.out.print("Name: ");
					String name = myscanner.nextLine();
					System.out.print("Surname: ");
					String surname = myscanner.nextLine();
					System.out.print("ID: ");
					int id = myscanner.nextInt();
					myscanner.nextLine();
					System.out.print("Does the student have food pass (y/n): ");
					String hasFoodPassStr = myscanner.nextLine();
					boolean hasFoodPass = false;
					if (hasFoodPassStr.equals("y")) {
						hasFoodPass = true;
					}
					System.out.print("Thesis Name: ");
					String thesisName = myscanner.nextLine();
					
					while(true) {
						
						try {
							System.out.print("Lecture Hours: ");
							lectureHours = myscanner.nextInt();
							break;
						}	
						catch (InputMismatchException e) {
							System.out.println();
				            System.err.println("Please enter an integer!");
				            myscanner.nextLine();
				            System.out.println();
						}
					}
			
					std.add(new PhdStudent(name,surname,id,hasFoodPass,thesisName,lectureHours ));
					cft.add(new PhdStudent(name,surname,id,hasFoodPass,thesisName,lectureHours));
					Student.studentCount++;
					System.out.println();
				}else if (choice == 4) {
					System.out.println();
					Collections.sort(std);
					System.out.println("List is sorted...");
					System.out.println();
					ListIterator<Student> li = std.listIterator();
				    while (li.hasNext()) {    
				    	li.next().DisplayInformation();
						System.out.println();		
				    }
					System.out.println();
				}else if (choice == 5) {
					System.out.println();
					System.out.println("The number of created student objects: " + Student.studentCount);
					System.out.println();
				}else if (choice == 6) {
					System.out.println();
					ListIterator<Student> ltr = std.listIterator();
					System.out.print("Enter the student ID to search the list: ");
					int idRemove = myscanner.nextInt();
					while(ltr.hasNext()) {	
						Student i = ltr.next();
				        if(i.getId() == idRemove) {
				        	System.out.println("Found " + i.getName() + " " + i.getSurname());
				        	System.out.println("Removing...");
				            ltr.remove();
				            break;
				        }
				    }
					System.out.println();
				}else if (choice == 7) {
					System.out.println();
					System.out.print("Name: ");
					String name = myscanner.nextLine();
					System.out.print("Surname: ");
					String surname = myscanner.nextLine();
					cft.add(new Personnel(name,surname));
					System.out.println();
				}else if (choice == 8) {
					System.out.println();
					System.out.println("Initiating food service...");
					System.out.println();
					Iterator<Cafeteria> itr = cft.iterator();
					while(itr.hasNext()) {	
						Cafeteria i = itr.next();
				        if(i instanceof Student) {
				        	Student s = (Student) i;
				        	s.serveFood();			        	
				        }else {
				        	Personnel p = (Personnel) i;
				        	p.serveFood();
				        }
				    }
				}else if (choice == 0) {
					break;
				}else {
					System.out.println();
					System.out.println("Not a valid choice");
					System.out.println();
				}
			}
			
			catch (InputMismatchException e) {
				System.out.println();
	            System.err.println("Please enter an integer!");
	            sc.nextLine();
	            System.out.println();
	        }
		}
	}
}
