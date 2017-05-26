package university;

/**
 * creates a Student class with valariables of name, graduationYear, GPA
 * numCoursesCompleted, inGoodStanding
 * also creates TA
 */
public class Student {
	String name;
	int graduationYear;
	double GPA;
	int numCoursesCompleted;
	boolean inGoodStanding;
	TA recitationTA;
	/**
	 * constructior which creates a student assigning values
	 * to the variables above
	 */
	public Student(String name, int graduationYear) {
		this.name = name;
		this.graduationYear = graduationYear;
		this.GPA = 0;
		this.numCoursesCompleted = 0;
		//all students are initially in good standing
		this.inGoodStanding = true;
		this.recitationTA = null;		
	}
	/**
	 * the getName method takes a student "object"
	 * @return the associated name
	 */
	public String getName(){
		return name;
	}
	/**
	 * the getGraduationYear method takes a student "object"
	 * @return the associated graduation year
	 */
	public int getGraduationYear(){
		return graduationYear;
	}
	/**
	 * the setGraduationYear method assigns a
	 * @param year value to the associated Student's graduation
	 * year
	 */
	public void setGraduationYear(int year){
		this.graduationYear = year;
	}
	/**
	 * the getGPA method takes a student "object"
	 * @return the associated GPA
	 */
	public double getGPA(){
		return this.GPA;
	}
	/**
	 * the isEligibleforDeanList method checks if the GPA
	 * associated with a student is above a 3.7 and that
	 * the same associated student is in good standing
	 * if those two options are met a true value is returned
	 * else a false value is returned
	 * @return
	 */
	public boolean isEligibleForDeanList(){
		if (this.GPA > 3.7 && this.inGoodStanding){
			return true;
		}
		else{
			return false;
		}
	}
	/**
	 * the takeCourse method prints out that a Student is enrolled in
	 * @param courseName
	 */
	public void takeCourse(String courseName){
		System.out.println(this.name + " is now enrolled in "+courseName);
	}
	/**
	 * the receiveGrade method prints out a
	 * @param courseName and associated 
	 * @param grade for a Student (assigning a numeric)
	 */
	public void receiveGrade(String courseName, String grade){
		System.out.println(this.name+" got "+grade+" in "+courseName);
		double numericValue = 0; //why does this work?
		if (grade == "A"){
			numericValue= 4;
		}
		else if (grade == "A-"){
			numericValue = 3.7;
		}
		else if (grade == "B+"){
			numericValue = 3.3;
		}
		else if (grade == "B"){
			numericValue = 3;
		}
		else if (grade == "B-"){
			numericValue = 2.7;
		}
		else if (grade == "C+"){
			numericValue = 2.3;
		}
		else if (grade == "C"){
			numericValue = 2.0;
		}
		else if (grade == "C-"){
			numericValue = 1.3;
		}
		else if (grade == "D"){
			numericValue = 1.0;
		}
		this.GPA = (this.GPA * this.numCoursesCompleted + numericValue)/(this.numCoursesCompleted+1);
		this.numCoursesCompleted +=1;
	}
	/**
	 * the caughtCheatng method assigns a Student as being
	 * in good standing
	 */
	public void caughtCheating(){
		this.inGoodStanding = false;
	}
	/**
	 * The printReport method prints out a Student's name,
	 * graduation year along with their GPA and then prints out
	 * the number of course(s) completed
	 */
	public void printReport(){
		System.out.println("This is "+this.name+", UPENN "+this.graduationYear);
		System.out.println("Their GPA is "+this.GPA);
		String numCoursesString ="";
		if (this.numCoursesCompleted ==1){
			numCoursesString = "course";
		}
		else{
			numCoursesString = "courses";
		}
		System.out.println("They have taken "+this.numCoursesCompleted + " " + numCoursesString);
	}
	/**
	 * the assignRecitationTA method assigns a new TA as the
	 * recitationTA and prints out their recitation time/name for
	 * a Student
	 * @param associatedTA
	 */
	public void assignRecitationTA(TA associatedTA){
		this.recitationTA = associatedTA;
		System.out.println(this.name + " your TA is " + associatedTA.getName() + " whose recitation is at " + associatedTA.getRecitationtime());
	}
}
