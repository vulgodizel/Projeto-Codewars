package Q02;

/* [6 kyu] Find the odd int (Link)
 * https://www.codewars.com/kata/54da5a58ea159efa38000836 */


public class FindTheOddInt {

	public static void main(String[] args) {

		int[] vt = {3,1,3,1,3,1,1}; 
		
		System.out.println(isSquare(vt));

	}

	public static int isSquare(int[] a) {

		int cont=0;
		  int valor=0;
		  for (int i=0; i<a.length; i++){
		    
		    for(int j=0; j<a.length; j++){
		    
		    	if (a[i]==a[j]) {
				cont++;	
				}
    	
		    }
		    valor = a[i];
		  
		    
		    if(cont%2!=0){
		      return a[i];
		      
		    }else{
		    cont=0;
		    valor=0;
		    }
		 
		
		  }
		 return 0;
}}
