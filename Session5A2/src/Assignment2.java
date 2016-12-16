
public class Assignment2 {
	/*
	 * Create student result processing system with an abstract class. All years
	 * students data can be entered and displayed by inherited sub classes.
	 * Abstract class should contain student roll, name and registration number.
	 */
	public static void main(String[] args) {

	}
}

abstract class ResultProcessing{
	String firstName;
	String lastName;
	int regNumber;
	int studentRoll;  // no idea what this is. 
	
	public abstract void displayStudentData();
	
	public abstract String getFirstName() ;
	public abstract void setFirstName(String firstName);
	public abstract String getLastName() ;
	public abstract void setLastName(String lastName) ;
	public abstract int getRegNumber();
	public abstract void setRegNumber(int regNumber) ;
	public abstract int getStudentRoll() ;
	public abstract void setStudentRoll(int studentRoll) ;
}

class StudentProcessing extends ResultProcessing{

	@Override
	public String getFirstName() {
		return firstName;
	}

	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String getLastName() {
		return lastName;
	}

	@Override
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public int getRegNumber() {
		return regNumber;
	}

	@Override
	public void setRegNumber(int regNumber) {
		this.regNumber = regNumber;
	}

	@Override
	public int getStudentRoll() {
		
		return studentRoll;
	}

	@Override
	public void setStudentRoll(int studentRoll) {
		this.studentRoll = studentRoll;
		
	}

	@Override
	public void displayStudentData() {
		System.out.println(firstName + " " + lastName + " " + regNumber + " " + studentRoll);
		
	}
	
}