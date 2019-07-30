package helloworld;
import java.util.Scanner;
import java.util.ArrayList;

public class HelloWorld {
	public static void main(String[] args) {
		int a;
		Scanner in = new Scanner(System.in);
		//a = in.nextInt();
		//int b = in.nextInt();
		ArrayList<Integer> numbers = new ArrayList();
		String input = in.nextLine();
		String[] inputArray = input.split(" ");
		for(int i = 0; i < inputArray.length; i++) {
			int c = Integer.parseInt(inputArray[i]);
			numbers.add(c);
		}
		long result = Tasks.maxspan(numbers);
		System.out.println(result);
	}
}
