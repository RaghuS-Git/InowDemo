package employeeVO;

import java.util.Scanner;

public class AgeCalcWithParams {
	Scanner sc = new Scanner(System.in);
	 
	 void calculateAge(int ageR , int ageS) {
		 
		 if(ageR > ageS) {
			 System.out.println("Ramu is elder than Somu");
		 }
		 else {
			 System.out.println("Somu is elder than Ramu");
		 }
	 }
	 public static void main(String[] args) {
		 AgeCalcWithParams ts = new AgeCalcWithParams();
		ts.calculateAge(23, 21);
	}

}
