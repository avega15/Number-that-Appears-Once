import java.util.*; 


public class firstInt{
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 4, 3, 2, 5};
		
		int answer = singleNumber(numbers);
		
		if(answer == -1){
			System.out.println("There are non-repeated numbers in the array");
		}else{
			System.out.println("There is a single " + answer + " in the array.");
			}
		
	}

	public static int singleNumber(int[] A) {
    
		Hashtable <Integer, Integer> table = new Hashtable<Integer, Integer>();
		
		for(int i = 0; i < A.length; i++){
			if(table.containsKey(A[i])){
				table.put(A[i], table.get(A[i]) + 1);
			}else{
				table.put(A[i], 1);    
			}
		}

		for(int i = 0; i < A.length; i++){
			if(table.get(A[i]) == 1){
				return A[i];
			}
		}
		return -1;

	}
}
