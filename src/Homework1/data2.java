package Homework1;

public class data2 {

	public static void main(String[] args) {
		String Data = "welcome";
		String letter1 = Data.substring (0, 4);
		String letter2 = Data.substring (( Data.length () -3 ), Data.length()).toUpperCase();
		String letter3 = Data.substring (4, Data.length () -3);
		String Sum = letter1 + letter2 + letter3;
		System.out.println(" Form " + Data +" to " + Sum);

	}

}
