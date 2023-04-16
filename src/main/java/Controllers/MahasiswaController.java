package Controllers;

import java.util.HashMap;

import Models.Mahasiswa;
import Repository.MahasiswaRepository;

public class MahasiswaController implements Controllers<String, Mahasiswa>{

	private final MahasiswaRepository mahasiswaRepository = MahasiswaRepository.getInstance();

	@Override
	public void add(Mahasiswa item) {
		mahasiswaRepository.add(item);
	}

	@Override
	public void remove(Mahasiswa item) {
		mahasiswaRepository.remove(item);
	}

	@Override
	public void update(Mahasiswa item) {
		mahasiswaRepository.update(item);
	}

	@Override
	public Mahasiswa get(String id) {
		return mahasiswaRepository.get(id);
	}

	@Override
	public boolean contains(String id) {
		return mahasiswaRepository.contains(id);
	}

	@Override
	public HashMap<String, Mahasiswa> getAll() {
		return mahasiswaRepository.getAll();
	}
}
