
public class SumOfArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//step1 - will be declaring an array
		int a[] = new int[10];
		int b = 300;
		//step2- to store the values in array - excel sheet or DB
		for(int i=0; i<a.length; i++){
			a[i]=b++;
		}
		//step3 - process to get the sum - logic
		int sum =0;
		for(int j=0; j<a.length; j++){
			sum = sum+a[j];
			
		}
		System.out.println("The sum of array of elements:" + sum);

	}

}
