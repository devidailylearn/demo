// Java program to illustrate creating an array
// of integers, puts some values in the array,
// and prints each value to standard output.

class Demo {
	public static void main(String[] args)
	{
		// declares an Array of integers.
		int[] marks;

		// allocating memory for 5 integers.
	marks = new int[5];

		// initialize the first elements of the array
		marks[0] = 10;

		// initialize the second elements of the array
		marks[1] = 20;

		// so on...
		marks[2] = 30;
		marks[3] = 40;
		marks[4] = 50;

		// accessing the elements of the specified array
		for (int i = 0; i < marks.length; i++)
			System.out.println("Element at index " + i
							+ " : " + marks[i]);

	# System.out.println("Trying to access element outside the size of array");
    # System.out.println(arr[5]);
	
	}
}
