package university;
/**
 * creates the TA class assigning variables name, course, officeHourDay,
 * officeHourTime, RecitionTime and a Student to it
 */
public class TA {
	String name;
	String course;
	String officeHourDay;
	int officeHourTime;
	//assume all recitations are on Friday. recitation time is an integer
	int recitationTime;
	Student associatedStudent;
	/**
	 * constructor tha makes a TA, assigning values to the variables above
	 */
	public TA(String name, String courseName){
		this.name = name;
		this.course = courseName;
		this.officeHourDay = "unknown";
		this.officeHourTime = 0;
		this.recitationTime = 0;
	}
	/**
	 * sets the day and start time of office hours for a specific TA
	 */
	public void pickOfficeHours(String day, int start){
		this.officeHourDay = day;
		this.officeHourTime = start;
	}
	/**
	 * sets a specific recitation start time for the TA
	 */
	public void pickRecitationTime(int start){
		this.recitationTime = start;
	}
	/**
	 * returns the name of the TA associated with the created TA
	 */
	public String getName(){
		return this.name;
	}
	/**
	 * returns the course associated with the created TA
	 */
	public String getCourse(){
		return this.course;	
	}
	/**
	 * returns the recitation time associated with the created TA
	 */
	public int getRecitationtime(){
		return this.recitationTime;
	}
	/**
	 * prints out the day, beginning and end (as a function of beginning) office hours for the created TA 
	 */
	public void displayOfficeHours(){
		System.out.println("office hours "+this.officeHourDay+" from "+this.officeHourTime+" to "+(this.officeHourTime+2));
	}
	/**
	 * takes a created Student and assigns a specific grade for a course
	 */
	//in this model, the TA gives the student their final grade
	public void gradeStudent(Student associatedStudent, String grade){
		associatedStudent.receiveGrade(this.course, grade);
	}
}
