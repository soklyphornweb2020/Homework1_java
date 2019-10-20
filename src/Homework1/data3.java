package Homework1;

public class data3 {

	public static void main(String[] args) {

		String data ="www.google.com/";
		String data1 = "";
		
		if (data.contains("/")) {
		  data1 = data.replaceFirst("/", "/wep2020");
		   System.out.println(data1);
		}else {
			System.out.println(data+"does not end with /");
		}
		
	}
}
