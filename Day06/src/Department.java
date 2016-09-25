
public class Department {

	//non static global variables
	
	public String dept_name;
	public int dept_id;
	public int no_of_emp;
	
	//global static variable
	public static String comp_name;
	
	
	// non static functions
	
	public void add_dept(){
		
		System.out.println("Department added");
	}
	public void change_dept(){
		
		System.out.println("Department changed");
	}

	
	//static method
	public static void national_holiday(){
		
		System.out.println("National holiday granted");
	}
}

