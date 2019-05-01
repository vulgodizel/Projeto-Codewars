package Q08;

/* [7 kyu] Complementary DNA (Link)
   https://www.codewars.com/kata/554e4a2f232cdd87d9000038 */

public class DnaStrand {

	
	public static void main(String[] args) {
		
	System.out.println(makeComplement("AAGC"));
	System.out.println(makeComplement("TTAGCA"));
	System.out.println(makeComplement("ATGCGTCA"));
	
	}

	public static String makeComplement(String dna) {
	
	dna = 	dna.replaceAll("A", "x");
	dna = 	dna.replaceAll("T", "A");
	dna = 	dna.replaceAll("x", "T");
		
	dna = 	dna.replaceAll("G", "x");
	dna = 	dna.replaceAll("C", "G");
	dna =	dna.replaceAll("x", "C");
			
		return dna;
	  }	
}
