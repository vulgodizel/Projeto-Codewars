package Q03;


/* [7 kyu] You're a square (Link)
   https://www.codewars.com/kata/54c27a33fb7da0db0100040e */

public class YoureASquare {

	public static void main(String[] args) {
		System.out.println(isSquare(3));
		System.out.println(isSquare(4));
		System.out.println(isSquare(25));
		System.out.println(isSquare(26));
		
		
	}
	public static boolean isSquare(int n) {
		return n<0? false : (Math.sqrt(n)>((int) Math.sqrt(n))? false : true);
		}
	}
	


