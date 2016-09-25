
public class Bank {

	
 String name;
	int accountbal;
	Members mem;

	
	public int interestgained(int increment)
	{
		
		accountbal = accountbal+increment;
		return accountbal;
		
	}
}
