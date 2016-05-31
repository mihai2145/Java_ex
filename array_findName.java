import java.util.Scanner;
public class array1
{
	public static void main( String[] args )
	{
		String arr1[] = { "Vasile", "Andrei", "Cristi" };
		double arr2[] = { 9.45 , 6.45 , 7.47 };
		int id[]={110214, 44120, 11204};
		int find_id; 
		String find_name = null;
		double find_score = 0;
		Scanner sc=new Scanner(System.in);
		int slot=0;

		for(int i=0; i<arr1.length; i++){
	
		System.out.println(arr1[i]+"  "+arr2[i]+"  "+id[i]);	
		
		}
		
		//find
		
		System.out.print("Find: ");
		find_id=sc.nextInt();
		
		//find loop
		
		for(int i=0; i<id.length; i++){
			
			if (id[i]==find_id){
				find_id=id[i];
				find_name=arr1[i];
				find_score=arr2[i];	
				slot=i;}

		}
		
		System.out.println("Found in slot "+slot);
		System.out.println(find_name);
		System.out.println(find_score);
		System.out.println(find_id);
	}
}
