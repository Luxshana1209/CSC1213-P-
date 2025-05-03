public class ex09{
static int fac(int a){
	int fact=1;
    for(int i=1;i<=a;i++){
	   fact=fact*i;
	}
	return fact;
}
public static void main (String[] args){
	System.out.println("Factorial: "+fac(5));
}
}