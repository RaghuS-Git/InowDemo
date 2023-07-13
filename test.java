package employeeVO;

import java.util.Scanner;

class Test2 {
	  
	 Scanner sc = new Scanner(System.in);
	 int ageOfRamu;
	 int ageOfSomu;
	 
	 void calculateAge() {
		 System.out.println(ageOfRamu);
		 int RamuAge = sc.nextInt();
		 System.out.println(ageOfSomu);
		 int somuAge = sc.nextInt();
		 
		 if(RamuAge > somuAge) {
			 System.out.println("Ramu is elder than Somu");
		 }
		 else {
			 System.out.println("Somu is elder than Ramu");
		 }
	 }
	 public static void main(String[] args) {
		Test2 ts = new Test2();
		ts.calculateAge();
	}
	 
	 

}
