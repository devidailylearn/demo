//when there is a need to iterate through the elements in a sequential manner 
//knowing the index of the currently processed element

 // Java program to illustrate enhanced for loop
 class Demo {
	// Main Function
	public static void main(String args[])
	{
		// String array
		String array[] = { "Ron", "Harry", "Hermoine" };

		// enhanced for loop
		for (String x : array) {
			System.out.println(x);
		}

		// for loop for same function
        System.out.println("-----------------------");
		for (int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
		
	}
}
