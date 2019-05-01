package Q06;

/* [7 kyu] Credit card mask (Link)
   https://www.codewars.com/kata/5412509bd436bd33920011bc */

public class Maskify {

	
	
	
	public static void main(String[] args) {

		
	System.out.println(maskify("123456789"));
	System.out.println(maskify("ABCDEFGHI"));
	System.out.println(maskify("1234-5678-9000"));
	System.out.println(maskify("1"));
	System.out.println(maskify("12"));
	System.out.println(maskify("123"));
	System.out.println(maskify("1234"));
	System.out.println(maskify(" "));
		
		
	}

	public static String maskify(String str) {

		String retornar = "";

		if (str.length() <= 4) {
			return str;
		} else {

			for (int i = 0; i < str.length() - 4; i++)
				retornar += "#";

			for (int i = 4; i > 0; i--)
				retornar += str.charAt(str.length() - i);

			return retornar;
		}
	}
}