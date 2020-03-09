package prototypepattern;

import java.util.Scanner;

public class PrototypeDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student roll number");
		int rollNumber = sc.nextInt();
		System.out.println("Enter students first name");
		String firstName = sc.next();
		System.out.println("Enter the students last name");
		String lastName = sc.next();
		System.out.println("Enter the students marks out of 100");
		double marks = sc.nextDouble();
		System.out.println("Enter the students phone number");
		String phoneNumber = sc.next();
		StudentDetails s1 = new StudentDetails(rollNumber, firstName, lastName, marks, phoneNumber);
		s1.showDetails();
		StudentDetails s2 = (StudentDetails)s1.getClone();
		s2.showDetails();
		

	}

}
