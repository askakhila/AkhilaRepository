package pack1;

public class Shadowing {
		String name = "Matthew";
		int age = 50;
		public static void printing() {
			String name ="John";
			int age = 50;
			System.out.println("name="+name);
			System.out.println("age="+age);
		}
	public static void main(String[] args) {
		printing();

	}

}
