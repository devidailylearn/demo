// Java program to illustrate using
// break to exit a loop
class Demo {
	public static void main(String args[])
	{		// Initially loop is set to run from 0-9
		for (int i = 0; i < 10; i++) {
			// terminate loop when i is 5.
			if (i == 3)
				continue;
			System.out.println("i: " + i);
		}
		System.out.println("Loop complete.");
	}
}
