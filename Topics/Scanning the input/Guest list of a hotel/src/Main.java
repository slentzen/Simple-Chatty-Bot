import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// start coding here
		List<String> guests = new ArrayList<>();

		while (scanner.hasNext()) {
			String output = scanner.next();
			guests.add(output.split(" ")[0]);
		}

		guests.stream()
				.sorted(Collections.reverseOrder()) // Method on Stream<Integer>
				.forEach(System.out::println);

	}
}
