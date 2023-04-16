package Repository;


import java.util.HashMap;

interface Repository<E,T> {


	public void add(T item);

	public void remove(T item);

	public void update(T item);

	public T get(String id);

	public boolean contains(E id);

	public HashMap<String, T> getAll();
}


