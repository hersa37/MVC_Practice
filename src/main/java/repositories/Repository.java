package repositories;


import models.Model;

import java.util.HashMap;

public interface Repository<E,T extends Model<E>> {

	void add(T item);

	void remove(T item);

	void update(T item);

	T get(E id);

	boolean contains(E id);

	HashMap<String, T> getAll();
}


