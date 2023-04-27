# RotateArray
Coding Assignment

Question:
The problem we would like you to solve deals with an array of integers. We want to rotate these integers
to a specified number of positions to the left.
If for example you have an array of integers [1,2,3,4,5,6,7] and we would like to rotate 2 positions to the
left, the solution expected would be [3,4,5,6,7,1,2].
Note: the solution should be able to handle a position value greater than the number of integers in the
array. If, for example, we would like to rotate [1,2,3,4,5,6,7] 8 positions to left, it would produce the
result [2,3,4,5,6,7,1]. Negative values for the positions to rotate will throw an error which the code
example should handle gracefully.

Code: RotateArray/codingAssignment/src/code/RotateArray.java

Test Cases: RotateArray/codingAssignment/src/code/RotateArrayTest.java



Solution: 
My initial approach was to create an additional array to store the rotated elements and return the array. However, this would use extra O[N] space. As an optimized solution, I came up with an approach in which extra space is not required.

In this approach, I created a helper function to reverse an array with a starting and an ending index. I first reverse the first part of the array which is the first part of the array that is the indices 0 to count-1. In the second part, I reverse the second part of the array, which is the indices count to array(length-1). Ultimately we reverse the whole array which ultimately leads to the required array shifted the required number of places to the left.

As a side note, I have moduloed the number of input rotations with the size of the array to get the actual number of rotations. Also, I have gracefully handled the case when the number of rotations is negative through required exceptions and output messages. I have also added various unit tests to make the code robust.

Dry Run: 
Let us consider the given scenario : Array : {1,2,3,4,5,6,7} || Number of rotations : {2}

After reversing the first two elements : {2,1,3,4,5,6,7}

After reversing the remaining array : {2,1,7,6,5,4,3}

After reversing the whole array : {3, 4, 5, 6, 7, 1, 2} --> This is the required answer

Time Complexity : O[N] : Where N is the number of elements in the array.

Space Complexity : O[1] : No extra space used

 


