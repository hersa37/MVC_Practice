package Models;

public class Mahasiswa implements Model<String> {

	private final String nim;
	private String nama;
	private int nilai;

	public Mahasiswa(String nim, String nama, int nilai) {
		this.nim = nim;
		this.nama = nama;
		this.nilai = nilai;
	}

	public void setNilai(int nilai) {
		this.nilai = nilai;
	}

	public String getNama() {
		return nama;
	}

	public int getNilai() {
		return nilai;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	@Override
	public String getKey() {
		return nim;
	}
}
