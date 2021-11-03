public class Lab9 {

	
	public static void main (String[] args){
		
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 16, 18, 20, 21, 23, 25, 27, 29};
		int sum = 0;
		// #1. Using the integer array above, iterate through the array and Print the numbers
		for (int i = 0; i < nums.length;i++){
			System.out.println(nums[i]);
			sum += nums[i];
			
		}
		System.out.println("the sum is " + sum);
		System.out.println();
		
		
		

		
		// #1a. Sum the values from the nums array and print the total
		
		
		
		
		
		
		
		// #2 Iterate through the nums array to find how many of the numbers are odd 
		// Print the total number of odd numbers
		System.out.println("Printing original array for calculations...");
		int evens = 0;
		int odds = 0;
		for (int i = 0; i < nums.length; i++){
			System.out.println(nums[i]);
			if (nums[i] % 2 == 0){
				evens++;
			}
			else {
				odds++;
			}
		}
		System.out.println("The number of odd numbers in the array is: "+ odds);
		
		
		

		String[] words = {"Bob", "Ole Miss", "football", "computer science", "arrays", "The Grove", "Oxford",
				 "Mississippi", "Rainy Mondays", "Boure Burgers", "Ajax", "Monday night football"};
		
		// #3 Iterate through the String array to find how long each word is.
		// Print each word and how long it is
		
		for (int i = 0; i < words.length; i++ ){
			int length = words[i].length();
			System.out.println();
			System.out.println(words[i] + "  "+ length);
		}
		System.out.println();
		
		
		
		
		
		
		double[] doub = new double[20];

		// #4 Using the double array above, iterate through the length of the array
		// Using the loop control variable insert a double into each cell of the array with
		// a value of multiplying the loop control variable by .60
		int control = 0;
		for (int i = 0; i < doub.length; i++){
			doub[i] = i * .6;
			System.out.println(doub[i]);
		}
		
		






		// #4a Iterate through the double array and Print the values
		

		
		
	}
}