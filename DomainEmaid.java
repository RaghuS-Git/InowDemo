package employeeVO;
import java.util.Scanner;

public class DomainEmaid {
	Scanner scs = new Scanner(System.in);
	
	void emailID() {
		System.out.println("Enter Your name to Create email Id");
		
		System.out.println("First Name : ");
		String fName = scs.next();
		
		System.out.println("Last Name : ");
		String Lname = scs.next();
		
		System.out.println("Your Customized email Id is : ");
		System.out.println(fName + "." + Lname + "@SmartIMS.com");
	}
	public static void main(String[] args) {
		DomainEmaid dm =  new DomainEmaid();
		dm.emailID();
	}
}
