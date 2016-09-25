
public class TestBank {

	
	public static void main(String[] args){
		
		Bank b1 = new Bank();
		b1.name="Hsbc";
		b1.accountbal=10000;
		b1.interestgained(500);
		System.out.println(b1.accountbal);
		
		
		//here we will create an object of members class
		
		Members m= new Members();
		m.add="1801 south avenue california";
		m.name="Jack Daniels";
		b1.mem = m;
		
		System.out.println(b1.mem.add);
		System.out.println(b1.mem.name);
	}
}
