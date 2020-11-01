package pack1;

public class trycatch {
	
	public static void main(String[] args) {
			int x=10;
			int y=2;
			int res=0;
			System.out.println("good");
			//System.out.println(arg[0]);
		//	String s="hello";
		//	System.out.println(s.length());
			//System.out.println("length of the string s is "+s.length());
			try {
			res=x/y;	
			String s="hello";
			System.out.println(s.length());
			}
			catch(NullPointerException p){
				System.out.println("something is nul here");
			}
			catch(ArithmeticException p) {
				System.out.println("cannot divide by 0");
			}
			finally {
				System.out.println("result is from finally"+res);
				//System.out.println("length of the string s is "+s.length());
			}
		}
	}

