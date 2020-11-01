package pack1;

public class DataTypesDemo {

	public static void main(String[] args) {
		float x=100.12345f;   //4bytes
		long l=(long)x;   //explicit (long is of 8bytes)
		System.out.println("long integer 8bytes...l = "+l);
		
		double d=x; //implicit(double is of 8bytes)
		System.out.println("double decimal 8bytes....d = "+d);
		
		float f=x; //implicit (float is 4bytes)
		System.out.println("f = "+f);
		
		char c='M';
		System.out.println("c : "+c);
		//x=c; // implicit 
		x = c;
		System.out.println("ascii of the letter :"+c+ " is " +x);
		
		
		//Explicit Casting
		int d1=99;
		char z=(char)d1;//Explicit(larger to smaller)
		System.out.println("ascii at : "+d1+" is "+z);
		
		float t=88.77f;
		System.out.println("t = "+t);
		d1=(int)t; //explicit(remember all the decimal values are larger)
		System.out.println("d1 : "+d1);
		
		//Please note that String is a class not a primitive data type
				//For all the objects the default value is null
				String s = "Hello String. I am learning how to use String";
				System.out.println("s = "+s);
			//	StringBuilder sb= new StringBuilder();
				StringBuffer sb= new StringBuffer();
			// Changing the first letter of the word to capital letter
			String ar[]= s.split(" ");
			for(String s1: ar) {
				//System.out.println(s1);
				sb.append(Character.toLowerCase(s1.charAt(0))).append(s1.substring(1)).append(" ");
			//	System.out.println(sn);
			}
			System.out.println(sb.toString());
	}		
}