import java.util.Scanner;
public class LetterAtTime
{
	public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		String message;
		char k,lx;
		int l,i;

		System.out.println("Give your message: ");
		System.out.print(">  ");
		message=sc.nextLine();

		l=message.length();
		System.out.println("This message has "+l+" characters");
		
		k=message.charAt(0);
		System.out.println("First letter is "+k);
		
		
		lx=message.charAt(l-1);
		System.out.println("Last letter is "+lx);
		
		
		for (i=0; i<l;i++){			
			System.out.println(i+" "+message.charAt(i));
		}
		
		
	}
}
