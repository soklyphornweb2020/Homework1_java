package Homework1;

public class data4 {
	
	public static void main(String[] args) {
		String data = "This is the most common way";
		char letter = 'o';
		int count = 0;
		for (int i = 0; i < data.length(); i++) {
			if(data.charAt (i) == letter) {
				count++;
			}
		}
		System.out.println( " here are " + "" + count +  " "  + "letter o in " + data );
	}
}
