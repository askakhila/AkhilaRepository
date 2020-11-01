package pack2;

public class StringBuilderDemo {

	public static void main(String[] args) {
		String s= "learning how to use stringBuilder";
		StringBuilder st= new StringBuilder();
		System.out.println("original string is  "+s);
		
		StringBuffer mt = new StringBuffer(s);
			String s2 = mt.reverse().toString();
			
		String ar[]=s2.split(" ");
		for(String s1:ar) {
			st.append(Character.toUpperCase(s1.charAt(0))).append(s1.substring(1)).append(" ");
		}
		System.out.println("Uppercase of last letter of the word in the sentence is  "+st.reverse().toString().trim());
		
	}
}
