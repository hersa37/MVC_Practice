package controllers;

import java.util.HashMap;

import models.Student;
import repositories.StudentRepository;

public class StudentController implements Controllers<String, Student>{

	private final StudentRepository studentRepository = StudentRepository.getInstance();

	@Override
	public void add(Student item) {
		studentRepository.add(item);
	}

	@Override
	public void remove(Student item) {
		studentRepository.remove(item);
	}

	@Override
	public void update(Student item) {
		studentRepository.update(item);
	}

	@Override
	public Student get(String id) {
		return studentRepository.get(id);
	}

	@Override
	public boolean contains(String id) {
		return studentRepository.contains(id);
	}

	@Override
	public HashMap<String, Student> getAll() {
		return studentRepository.getAll();
	}
}
