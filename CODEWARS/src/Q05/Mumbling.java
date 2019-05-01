package Q05;

/* [7 kyu] Mumbling (Link)
   https://www.codewars.com/kata/5667e8f4e3f572a8f2000039 */

public class Mumbling {

	public static void main(String[] args) {

		System.out.println(accum("abcd"));
		System.out.println(accum("FGHIJK"));
		System.out.println(accum("kLJoDcZA"));
		System.out.println(accum("qQAaZz"));
		
		
	}

	public static String accum(String s) {
		
		String retornar="";
		
		retornar += String.valueOf(s.charAt(0)).toUpperCase();
		for (int i = 1; i < s.length(); i++) {
			retornar += "-"+ (String.valueOf(s.charAt(i)).toUpperCase());
			
			for (int j = 0; j < i; j++) {
				retornar += (String.valueOf(s.charAt(i)).toLowerCase());
			}
		
		}

		return retornar;	
	}

}
