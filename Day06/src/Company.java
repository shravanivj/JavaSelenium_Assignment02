
public class Company {

	public static void main(String[] args) {
		
		Department d = new Department();
		Department d1 = new Department();
		Department.comp_name= "Microsoft";
		Department.national_holiday();
		
		
		d.dept_id=10;
		d.dept_name= "Telecom";
		d.no_of_emp=1000;
		
		d.add_dept();
		d.change_dept();
		
		
		d1.dept_id=101;
		d1.dept_name= "Sales";
		d1.no_of_emp=5000;
		
		d1.add_dept();
		d1.change_dept();
		
		System.out.println("Depattment_id =" + d.dept_id);
		System.out.println("Depattment_name =" + d.dept_name);
		System.out.println("No of Employees =" + d.no_of_emp);
		
		
		System.out.println("Depattment_id =" + d1.dept_id);
		System.out.println("Depattment_name =" + d1.dept_name);
		System.out.println("No of Employees =" + d1.no_of_emp);
	}
	
	

}
