
public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0;
		while(i<=10)
		{
			System.out.println("Looping statement: " + i);
			i++;
			
		}

		int j = 2;
		while(j >= 1){
			System.out.println("Looping reverse: " + j);
			--j;
		}
		
		/* debug - double click from where u want to debug so there will be a linebreakpoint
		click on debug and F6 so that it will execute line by line */
	
		int a= 3566;
		int b=a;
		int sum =0;
		while(a >=0){
			sum = sum + (a%10);
			a=a/10;
		}
		System.out.println("sum of individual digits of"+a+"is:"+ sum);
	}
	
	

}
