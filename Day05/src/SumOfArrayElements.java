
public class SumOfArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// step 1 - declare two dimensional array
		int a[][] = new int[5][6];
		
		int b=10;
		//step 2 - read the elements from excel or DB
		for(int i =0; i < a.length; i++){
			
			for(int j=0; j<a[0].length; j++){
				a[i][j]= b++;
				System.out.print(a[i][j]+ "  ");
			}
			System.out.println();
		}
		
		// logic for the requirment - req is sum
		int sum = 0;
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[0].length; j++){
			
				sum = sum + a[i][j];
				
			}
		}

		System.out.println("The sum of two dimesional array elements is: " + sum);
	}

}
