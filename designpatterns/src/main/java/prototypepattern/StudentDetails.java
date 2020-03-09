package prototypepattern;

public class StudentDetails implements Prototype {
	
	private int rollNumber;
	private String firstName;
	private String lastName;
	private double marks;
	private String phoneNumber;

	public StudentDetails(int rollNumber, String firstName, String lastName, double marks, String phoneNumber) {
		super();
		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.marks = marks;
		this.phoneNumber = phoneNumber;
	}
	
	public void showDetails() {
		System.out.println(rollNumber+ "\t" +firstName+ "\t" +lastName+ "\t" +marks+ "\t"+phoneNumber); 
	}
	
	public Prototype getClone() {
		return new StudentDetails(rollNumber, firstName, lastName, marks, phoneNumber);  
	}
	

}
