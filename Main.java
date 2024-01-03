// Itay Mizikov ; ID: 315541615 ; 20/5/23
package q1;

public class Main {
	public static void main(String[] args) {
		// Create a SortedGroup of Student objects
		SortedGroup<Student> studentGroup = new SortedGroup<>();
		try {
			studentGroup.add(new Student("Alice", 1, 85));
			studentGroup.add(new Student("Bob", 2, 75));
			studentGroup.add(new Student("Charlie", 3, 58));
			studentGroup.add(new Student("David", 4, 90));
			studentGroup.add(new Student("Ron", 5, 60));
			studentGroup.add(new Student("Shir", 6, 63));
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid input: " + e.getMessage());
		}

		// Print the original group
		System.out.println("Original Group:");
		Reduce.printGroup(studentGroup);
		System.out.println();

		// Define the threshold student grade
		Student threshold = new Student("", 0, 60);

		// Reduce the group based on the threshold
		SortedGroup<Student> reducedGroup = Reduce.reduce(studentGroup, threshold);

		// Print the reduced group
		System.out.println("Reduced Group:");
		Reduce.printGroup(reducedGroup);
	}

}