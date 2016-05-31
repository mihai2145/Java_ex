public class nested_loop2 
{ 

	public static void main(String args[])  
	{ 
		
	for(int i=100;i<999;i++){	
	if(ax(i)==true){	
		System.out.println(i);	}
		

	}
	}
	
	
	

		public static boolean ax(int i){
		int a=i/100;
		int b=i%100/10;
		int c=i%10;
		
		if((a*a*a+b*b*b+c*c*c)==i){
		return true; }
		else { 
		return false;}
        }}
