
public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// single
		int a[]= new int[3];
		a[0]=10;
		a[1]=20;
				a[2] = 30;
		for(int i=0; i< a.length; i++)
		{
			a[i]=100;
			System.out.println(a[i]);
		}
		
		//ex- where we have rows adn columns like matrix

		//first is row and second is column
		int b[][]=new int[4][5];
		b[0][0]= 10;
		b[0][1]=20;
		b[0][2]=30;
		b[0][3]=40;
		
		b[1][0]= 10;
		b[1][1]=20;
		b[1][2]=30;
		b[1][3]=40;
		
		System.out.println("Size of array is :" + b.length);
		System.out.println("column size of array is:" + b[0].length);
		
		System.out.println("value of 2 dimensional array:");
		
		
		// first loop for num of rows
		for(int i=0; i<b.length; i++){
			//second loop for num of columns
			for(int j=0; j<b[0].length;j++){
				
				b[i][j] = 34; 
				System.out.print(b[i][j] + "  ");
				
			}
			System.out.println();
		}
		
		
	}

}
