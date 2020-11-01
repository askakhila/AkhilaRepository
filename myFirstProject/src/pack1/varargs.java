package pack1;

public class varargs {
//	static void varg(int... num) {
//	 System.out.println("using var args in java"+num);	
//		}
	//	static void varg(int num) {
//		 System.out.println("using int datatype in java"+num);
//	}
   
//	static void display(String... values){  
//		  System.out.println("display method invoked ");  
//		  for(String s:values){  
//		   System.out.println(s);  
//		  }  
//		 }  
//		  
//		 public static void main(String args[]){  
//		  
//		 display();//zero argument   
//		 display("hello");//one argument   
//		 display("my","name","is","varargs");//four arguments  
//		 		 }   
		 
			   
			 static void display(int num,String... values){  
			  System.out.println("number is "+num);  
			  for(String s:values){  
			   System.out.println(s);  
			  }  
			 }  
			  
			 public static void main(String args[]){  
			  
			 display(500, "hello");//one argument   
			 display(1000,"my","name","is","varargs");//four arguments  
			 }   
			
}
