// Itay Mizikov ; ID: 315541615 ; 20/5/23
package q1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * The SortedGroup class represents a collection of elements that are sorted in
 * ascending order. It provides methods to add elements, remove elements, and
 * iterate over the collection.
 *
 * @param <T> the type of elements in the collection, must implement Comparable
 *            interface
 */
public class SortedGroup<T extends Comparable<T>> {
	private ArrayList<T> group;

	public SortedGroup() {
		group = new ArrayList<>();
	}

	/**
	 * Adds an element to the SortedGroup while maintaining the sorted order.
	 *
	 * @param t the element to be added
	 */
	public void add(T t) {
		int low = 0;
		int high = group.size() - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			T midElement = group.get(mid);

			if (t.compareTo(midElement) < 0) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		group.add(low, t);
	}

	/**
	 * Removes all occurrences of the specified element from the SortedGroup.
	 *
	 * @param t the element to be removed
	 * @return the number of elements removed from the SortedGroup
	 */
	public int remove(T t) {
		int count = 0;
		for (int i = group.size() - 1; i >= 0; i--) {
			if (group.get(i).equals(t)) {
				group.remove(i);
				count++;
			}
		}

		return count;
	}

	/**
	 * Returns an iterator over the elements in the SortedGroup.
	 *
	 * @return an iterator over the elements in the SortedGroup
	 */
	public Iterator<T> iterator() {
		return group.iterator();
	}
}
