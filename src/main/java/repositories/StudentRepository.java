package repositories;


import java.util.HashMap;

import models.Student;
public class StudentRepository implements Repository<String, Student> {

	private final HashMap<String, Student> student = new HashMap<>();
	private static StudentRepository instance = null;

	private StudentRepository() {
	}

	public static StudentRepository getInstance() {
		if (instance == null) {
			instance = new StudentRepository();
		}
		return instance;
	}

	@Override
	public void add(Student item) {
		student.put(item.getKey(), item);
	}

	@Override
	public void remove(Student item) {
		student.remove(item.getKey());
	}

	@Override
	public void update(Student item) {
		student.replace(item.getKey(), item);
	}

	@Override
	public Student get(String id) {
		return student.get(id);
	}

	@Override
	public boolean contains(String id) {
		return student.containsKey(id);
	}

	@Override
	public HashMap<String, Student> getAll() {
		return student;
	}

}



