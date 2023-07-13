package employeeVO;

import java.util.Scanner;

 class EmployeeDetailsVO {
	
//	Scanner sc = new Scanner(System.in);
	int age ;
	String name;
	String DOB;
	long mobileNumer;
	String emailAddress;
	int test = 12;
	
	 static void collectingDetailsFromEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name");
		String name1 = sc.next();
		
		//System.out.println(a + b);
		
		System.out.println("Enter your Email");
		String email = sc.next();
		
		System.out.println("Enter your DOB");
		String dateOfBirth = sc.next();
		
		
		
		System.out.println(name1);
		System.out.println(email);
		System.out.println(dateOfBirth);
				
	}
		
	public static void main(String[] args) {
		EmployeeDetailsVO emp = new EmployeeDetailsVO();
		System.out.println(emp);
		
		EmployeeDetailsVO emp2 = new EmployeeDetailsVO();
		System.out.println(emp2);
	}

}
