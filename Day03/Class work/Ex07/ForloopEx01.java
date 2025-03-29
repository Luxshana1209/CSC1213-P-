import java.util.Scanner;
class ForloopEx01{
public static void main(String args[]){
Scanner ob = new Scanner(System.in);
System.out.println("Enter the Number: ");
int Number = ob.nextInt();
for(int i=1;i<=Number;i++){
System.out.print(i+"\t");
}
}
}
