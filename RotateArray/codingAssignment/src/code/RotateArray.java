package code;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
	
		int[] arr = {1,2,3,4,5,6,7};
		int count = 2;
		if(count<0) System.out.println("Number of rotations cannot be negative");
		else {
			arr = rotateArrayToLeft(arr,count);
			System.out.println("The rotated array is : " +   Arrays.toString(arr));
		}

	}
	public static int[] rotateArrayToLeft(int[] arr, int count) {
		if(count<0)  throw new IllegalArgumentException("Number of rotations cannot be negative");
	    count %= arr.length;
	    reverseArray(arr, 0, count - 1); //reverse the first part of the array
	    reverseArray(arr, count, arr.length - 1); // reverse the remaining half
	    reverseArray(arr, 0, arr.length - 1); //reverse the complete array
	    return arr;
	    
	    
	  }
	  public static void reverseArray(int[] arr, int left, int right) {
	    while (left < right) {
	      int temp = arr[left];
		  arr[left] = arr[right];
	      arr[right] = temp;
	      left++;
	      right--;
	    
	    }
	  }
}
