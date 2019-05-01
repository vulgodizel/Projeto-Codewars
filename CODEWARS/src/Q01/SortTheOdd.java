package Q01;

/* [6 kyu] Sort the odd (Link)
   https://www.codewars.com/kata/578aa45ee9fd15ff4600090d */

public class SortTheOdd {

	
	public static void main(String[] args) {
		
		int array[] = {2,3,0,1,7,5};
		
		
		System.out.println(sortArray(array));
		
		
		
	}
	

	
	public static int[] sortArray(int[] array) {

		int aux;
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		

		for (int i = 0; i < array.length; i++) {


			if (array[i] % 2 != 0) {

				for (int j = 0; j < array.length; j++) {

					if (array[i] < array[j] && array[j] % 2 != 0) {

						aux = array[j];
						array[j] = array[i];
						array[i] = aux;

					}

				}

			}
		}

		System.out.println("=============");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		
		return array;
	}

}
