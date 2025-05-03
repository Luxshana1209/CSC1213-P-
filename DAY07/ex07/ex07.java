public class ex07{
	static int cube(int num){
		return num*num*num;
	}
	public static void main(String[] args){
		int result = cube(3);
		System.out.println("cube: "+result);
		System.out.println("cube: "+cube(5));
	}
}