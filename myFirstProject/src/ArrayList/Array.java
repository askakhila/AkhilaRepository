package ArrayList;
import java.util.Arrays;
public class Array {

	public static void main(String[] args) {
		
		String s1= "hello ! ";
		String p = null;
				
		char c[] =s1.toCharArray();
		String s = Arrays.toString(c);
		for(int i=0; i<s1.length(); i++) {
		System.out.println(c[i]);
		}
		System.out.println("Array s="+s);
		System.out.println(Arrays.toString(c));
		String s5="hello-hi-good-morning.-have-a wonderful[ day] [ahaead";
		
		String[] s6=s5.split("[ -]");
		for(String s7:s6) {
			System.out.println("after split we have"+s7.toUpperCase());
	//		 System.out.println(s7.chars());
	
					}
		}
}
