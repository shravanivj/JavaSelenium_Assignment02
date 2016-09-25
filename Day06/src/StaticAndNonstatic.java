
public class StaticAndNonstatic {

	
	public static int q =200; // global static variable
	
	public int p=100; // global non static variable
	//static function
	public static void first_function(){
		int abc = 20; // abc is local variable to this static function
	}
	
	//non static function or method
	
	public void second_function(){
		
		int xyz = 100; // xyz is also local variable to this second_function method
	}
}
