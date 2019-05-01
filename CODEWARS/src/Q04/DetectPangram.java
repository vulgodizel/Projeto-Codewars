package Q04;

/* [6 kyu] Detect pangram (Link)
   https://www.codewars.com/kata/545cedaa9943f7fe7b000048 */

public class DetectPangram {

	public static void main(String[] args) {

		
		System.out.println(check(""));
		System.out.println(check("The quick brown fox jumps over the lazy dog"));
		System.out.println(check("ABC"));
		System.out.println(check("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
		
		
	}

	public static boolean check(String sentence) {
	
	int cont=0;
		for (char c = 'a'; c <= 'z'; c++) {
			if (sentence.toLowerCase().contains(String.valueOf(c))) {
				cont++;
			}
		}
		return cont==26? true : false;
	}

}
