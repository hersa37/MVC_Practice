package Repository;


import java.util.HashMap;

import Models.Mahasiswa;
public class MahasiswaRepository implements Repository<String, Mahasiswa> {

	private final HashMap<String, Mahasiswa> mahasiswa = new HashMap<>();
	private static MahasiswaRepository instance = null;

	private MahasiswaRepository() {
	}

	public static MahasiswaRepository getInstance() {
		if (instance == null) {
			instance = new MahasiswaRepository();
		}
		return instance;
	}

	@Override
	public void add(Mahasiswa item) {
		mahasiswa.put(item.getKey(), item);
	}

	@Override
	public void remove(Mahasiswa item) {
		mahasiswa.remove(item.getKey());
	}

	@Override
	public void update(Mahasiswa item) {
		mahasiswa.replace(item.getKey(), item);
	}

	@Override
	public Mahasiswa get(String id) {
		return mahasiswa.get(id);
	}

	@Override
	public boolean contains(String id) {
		return mahasiswa.containsKey(id);
	}

	@Override
	public HashMap<String, Mahasiswa> getAll() {
		return mahasiswa;
	}

}



