package employeeVO;

import java.util.Scanner;

public class AgeCalc {
	Scanner sc = new Scanner(System.in);
	 int ageOfRamu;
	 int ageOfSomu;
	 
	 void calculateAge() {
		 System.out.println("Enter Ramu Age");
		 int RamuAge = sc.nextInt();
		 System.out.println("Enter Somu Age");
		 int somuAge = sc.nextInt();
		 
		 if(RamuAge > somuAge) {
			 System.out.println("Ramu is elder than Somu");
		 }
		 else {
			 System.out.println("Somu is elder than Ramu");
		 }
	 }
	 public static void main(String[] args) {
		AgeCalc ac = new AgeCalc();
		ac.calculateAge();
	}

}
