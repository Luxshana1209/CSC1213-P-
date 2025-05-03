public class ex05{
	static int sum(int a,int b){
		return a+b;
	}
	static double sum(double a,double b){
		return a+b;
	}
	public static void main(String[] args){
		int  intresult=sum(5,10);
		double doubleresult=sum(3.2,5.3);
		
		System.out.println("Sum(int): "+ intresult);
		System.out.println("Sum(double): "+ doubleresult);
	}
}