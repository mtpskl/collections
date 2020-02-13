package collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		stringList.add("First");
		stringList.add("Second");
		
		for(String i :stringList) {
			System.out.println(i);
		}
		
		stringList.remove(0);
		
		for(String i :stringList) {
			System.out.println(i);
		}
		
		String item = stringList.get(0);
		stringList.set(0, "Third");

		for(String i :stringList) {
			System.out.println(i);
		}
		
		
		System.out.println(stringList.contains("Third"));
		
		
		
	}
}

