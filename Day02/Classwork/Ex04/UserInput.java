import java.util.Scanner;
class UserInput{
	public static void main(String args[]){
		String fname;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter your name: ");
		fname = sc.nextLine();
		
		System.out.print("Enter your RegNo: ");
		String RegNo=sc.next();
		
		System.out.print("Enter your Age: ");
		int Age=sc.nextInt();
		
		System.out.print("Enter your MobileNumber: ");
		long MobileNumber=sc.nextLong();
		
		System.out.print("Enter your GPA: ");
		double GPA=sc.nextDouble();
		
		System.out.print("Enter the Sex (M/F): ");
		char Sex=sc.next() .charAt(0);
		
		System.out.println("Your Full name: "+fname+"\n"+"Your Registration Number: "+RegNo+"\n"+"Your Age: "+Age+"\n"+"Sex(M/F): "+Sex+"\n"+"Your MobileNumber: "+MobileNumber+"\n"+"Your GPA: "+GPA);
	}
}