package javaPracticeExample;

import java.util.Arrays;

public class LeftRotateExample {

	public static void main(String[] args) {
		//left rotate example
	
		int numbers[] = {5,6,7,8,9,10};  //6,7,8,9,10,5
		
		int firstNumber = numbers[0];
		int i=0;
		for(i=0; i<numbers.length-1; i++) {
			
			numbers[i] = numbers[i+1];
			
		}
		numbers[i] = firstNumber;
		
		
		System.out.println(Arrays.toString(numbers));
		

	}

}
