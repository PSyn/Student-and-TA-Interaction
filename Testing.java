package university;

public class Testing {

	public static void main(String[] args) {
		//creates student1
		Student student1 = new Student("alpha", 2018);
		//assigns cis110 to student1
		student1.takeCourse("cis110");
		//creates a TA with a name and course association
		TA ta110 = new TA("beta", "cis110");
		//assigns office hours to the created TA
		ta110.pickOfficeHours("Monday", 5);
		//prints office hours of the created TA
		ta110.displayOfficeHours();
		//assigns recitation hours to the created TA
	    ta110.pickRecitationTime(11);
	    //assigns the created TA to student1
	    student1.assignRecitationTA(ta110);
	    //lets the TA assign a grade to student1
	    ta110.gradeStudent(student1, "A");
	    //prints the report for student1
	    student1.printReport();
	    //assigns student one to take the cis120 class
	    student1.takeCourse("cis120");
	    //creates a new TA (ta120 with the name beta for the course cis120
	    TA ta120 = new TA("gamma", "cis120");
	    //assigns office hours to ta120
	    ta120.pickOfficeHours("Tuesday", 1);
	    //assigns recitiation hours to ta120
	    ta120.pickRecitationTime(3);
	    //assigns the new TA to student 1
	    student1.assignRecitationTA(ta120);
	    //gives a grade to student one for the cis120 course
	    ta120.gradeStudent(student1, "B+");
	    //checks if the GPA is high enough for Dean's list
	    student1.isEligibleForDeanList();
	    //Prints student1's new report
	    student1.printReport();
	    //prints whether the stuent is eligible for the Dean's list
	    System.out.println(student1.getName() + " is eligible for dean's list: " + student1.isEligibleForDeanList());
	    
		
				
	}

}
