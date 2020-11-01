package pack1;

public class SwitchcaseString {

	public static void main(String[] args) {
		//int i=3;
		//char j='J';
		String j = "Dec";
		String monthString;
		switch(j) {
		case "Jan": monthString ="January";
				break;
		case "Feb": monthString ="february";
				break;
		case "Mar": monthString="March";
				break;
		default: monthString="invalid month";
				break;
			}
		System.out.println(monthString);
		
	}

}
