import java.util.*; 


public class firstInt{
	public static void main(String[] args) {
		//Any array of integers works
		int[] numbers = {1, 2, 3, 4, 5, 4, 3, 2, 5};
		
		int answer = singleNumber(numbers);
		
		if(answer != -1){
			System.out.println("There is a single " + answer + " in the array.");
		}
		
	}

	public static int singleNumber(int[] A) {
		//We use a hashtable so we can count the repeated integers
		Hashtable <Integer, Integer> table = new Hashtable<Integer, Integer>();
		
		for(int i = 0; i < A.length; i++){
			if(table.containsKey(A[i])){
				table.put(A[i], table.get(A[i]) + 1);
			}else{
				table.put(A[i], 1);    
			}
		}

		//Go through the array, checking if there are repeats in the hashtable
		for(int i = 0; i < A.length; i++){
			if(table.get(A[i]) == 1){
				//Return once we find the first non-repeated integer
				return A[i];
			}
		}
		
		//If there are no non-repeated integers then we state so
		System.out.println("There are no non-repeated integers.");
		return -1;

	}
}
