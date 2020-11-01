package pack1;

public class VarModifier 
{ 
       	   static int x = 11; 
    	    private int y = 33; 
    	    public void method1(int x) 
    	    { 
    	    	System.out.println("x="+x);
    	        VarModifier t = new VarModifier(); 
    	        this.x = 22; 
    	        this.y = 40;
    	        x=23;
    	        System.out.println("x="+x);
    	        y = 44; 
    	        System.out.println("Test.x: " + VarModifier.x); 
    	        System.out.println("t.x: " + t.x); 
    	        
    	        System.out.println("this.y"+t.y);
    	        System.out.println("t.y: " + t.y); 
    	        System.out.println("y: " + y); 
    	    } 
    	  VarModifier()
    	  {
    		  System.out.println("default constructor");
    		  this.y=100;
    	  }
    	    public static void main(String args[]) 
    	    { 
    	        VarModifier t = new VarModifier(); 
    	        t.method1(5); 
    	        int a = 5; 
    	   //     for (int a = 0; a < 5; a++) 
    	        { 
    	            System.out.println(a); 
    	        } 
    	    } 
    
} 
