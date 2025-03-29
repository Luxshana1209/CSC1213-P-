import java.util.Scanner;
class Ex03{
public static void main(String args[]){
Scanner ob = new Scanner(System.in);

System.out.println("Letter: ");
char Letter = ob.next().charAt(0);

switch(Letter){
case 'a':case 'e':case'i' : case 'o': case 'u': 
case 'A':case 'E':case 'I':case 'O': case 'U':
System.out.println("It's vowel");
 break;
  default: System.out.println("It's not vowel");
  }
  }
  }
 