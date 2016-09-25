
public class FirstJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//comments
		//This statement is to print the below statement -- single line comment
		/*
		 multi line comment 
		 */
		 // shortcut sysout ctrl spacebar for system.out.println("");
		System.out.println("This is my first java program");
		//println - cursor goes to next line. print cursor will be on same line
        System.out.print("This is my second line"); 
        System.out.println("This is my third line");
        
        //DataTypes
        
        int x = 100; //4 bytes
        long l = 5000; // 8 bytes
        double d = 45.678; // 8 bytes
        char c='a';
        boolean b = true;
        
        System.out.println(100);
        System.out.println(x);
        System.out.println("100");
        System.out.println("x");
        System.out.println(2>1);
        
        //if statement
        int a = 10;
        int y = 5;
        if(a > y)
        {
        	System.out.println("a is greater than y");
        }
        else
        {
        	System.out.println("y is greater than a");
        }
	}

}
