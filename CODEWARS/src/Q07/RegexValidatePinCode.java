package Q07;

/* [7 kyu] Regex validate PIN code (Link)
   https://www.codewars.com/kata/55f8a9c06c018a0d6e000132 */


public class RegexValidatePinCode {

	
	public static void main(String[] args) {
		System.out.println(validatePin("1234"));
		System.out.println(validatePin("123456"));
		System.out.println(validatePin("00x0"));
		System.out.println(validatePin("789abc"));
		
	
	}

	 public static boolean validatePin(String pin) {
		 
		for (int i = 0; i < pin.length(); i++) {
			if (!String.valueOf(pin.charAt(i)).matches("[0-9]"))	
		    return false;	
		}	
		return (pin.length()==4 || pin.length()==6? true : false);	
	 }	
}
