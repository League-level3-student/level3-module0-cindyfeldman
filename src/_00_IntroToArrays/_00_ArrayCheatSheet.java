package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
String[] string = new String[5];
		//2. print the third element in the array
	System.out.println(string[2]);
		//3. set the third element to a different value
	string[2] = "hi";
		//4. print the third element again
		System.out.println(string[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for (int i = 0; i < string.length; i++) {
			string[i] = "array";
			System.out.println(string[i]);
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		
		//7. make an array of 50 integers
		int[] ints = new int[50];
Random r = new Random();
		//8. use a for loop to make every value of the integer array a random number
for (int i = 0; i < ints.length; i++) {
	ints[i] =r.nextInt();
}
int smallest = 9999;
for(int i = 0; i < ints.length; i++) {
	if (ints[i]<smallest) {
	smallest=ints[i];

	} 
	
}System.out.println(smallest+"this is smallest");
		//9. without printing the entire array, print only the smallest number on the array

		//10 print the entire array to see if step 8 was correct

		//11. print the largest number in the array.
		int largest =-9999;
		for (int i = 0; i < ints.length; i++) {
			if(ints[i] > largest) {
			largest = ints[i];
			}
		
		}
		//12. print only the last element in the array
		System.out.println(largest+"this is largest");
	}
}
