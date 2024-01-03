// Itay Mizikov ; ID: 315541615 ; 20/5/23
package q1;

public class Student implements Comparable<Student> {
	private String name;
	private long id;
	private int grade;

	public Student(String name, long id, int grade) throws IllegalArgumentException {
		super();
		this.name = name;
		this.id = id;
		if (grade < 0 || grade > 100) {
			throw new IllegalArgumentException("The grade should be between 0-100");
		}
		this.grade = grade;

	}

	public boolean equals(Object obj) {
		if (!(obj instanceof Student)) {
			return false;
		}
		// in case the object is Student compare their id
		Student student = (Student) obj;
		return id == student.id;
	}

	public int compareTo(Student st) {
		int res = (grade - st.grade);
		if (res > 0) {
			return 1;
		}
		if (res < 0) {
			return -1;
		}

		return 0;

	}

	public String toString() {
		return "Student: [name= " + name + ", id= " + id + ", grade= " + grade + "]";
	}

}