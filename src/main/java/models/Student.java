package models;

public class Student implements Model<String> {

	private final String nim;
	private String name;
	private int grade;

	public Student(String nim, String name, int grade) {
		this.nim = nim;
		this.name = name;
		this.grade = grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getKey() {
		return nim;
	}
}
