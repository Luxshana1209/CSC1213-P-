public class ex08{
	static String age(int a){
		if(a>=18)
		{
			return ("Eligible to vote");
		}
		else 
		{
			return ("Not eligible");
		}
	}
	public static void main(String[] args){
		System.out.println("voting Eligibility: "+age(12));
		System.out.println("voting Eligibility: "+age(22));
	}
}