enum Menu {
	M1("1. Create Student"), 
	M2("2. Create a MasterStudent"), 
	M3("3. Create a PhDStudent"), 
	M4("4. Display all students"), 
	M5("5. Display the student count"),
	M6("6. Find and remove a student"),
	M7("7. Add a personnel"),
	M8("8. Serve people waiting in cafeteria line"),
	M9("0. Exit ");
	
	private String item;

	Menu(String it) {
		item = it;
	}

	String getItem() {
		return item;
	}
}
