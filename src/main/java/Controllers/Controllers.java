package Controllers;

import Models.Model;

import java.util.HashMap;

interface Controllers<E, T extends Model<E>> {
	void add(T item);

	void remove(T item);

	void update(T item);

	T get(E id);

	boolean contains(E id);

	HashMap<E,T> getAll();
}
