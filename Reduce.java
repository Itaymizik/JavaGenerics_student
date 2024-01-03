// Itay Mizikov ; ID: 315541615 ; 20/5/23
package q1;

import java.util.Iterator;

/**
 * The Reduce class provides static methods to perform reduction operations on a
 * SortedGroup.
 */
public class Reduce {

	/**
	 * Reduces the SortedGroup by removing elements that are less than or equal to
	 * the specified element. Returns a new SortedGroup containing only the elements
	 * greater than the specified element.
	 *
	 * @param <T>    the type of elements in the SortedGroup, must implement
	 *               Comparable interface
	 * @param sGroup the SortedGroup to be reduced
	 * @param x      the element to compare against
	 * @return a new SortedGroup containing only the elements greater than the
	 *         specified element
	 */
	public static <T extends Comparable<T>> SortedGroup<T> reduce(SortedGroup<T> sGroup, T x) {
		SortedGroup<T> greaterGroup = new SortedGroup<>();

		Iterator<T> iter = sGroup.iterator();
		for (; iter.hasNext();) {
			T t = iter.next();
			if (t.compareTo(x) > 0) {
				greaterGroup.add(t);
			}
		}

		return greaterGroup;
	}

	/**
	 * Prints the elements in the SortedGroup.
	 *
	 * @param <T>      the type of elements in the SortedGroup, must implement
	 *                 Comparable interface
	 * @param students the SortedGroup to be printed
	 */
	public static <T extends Comparable<T>> void printGroup(SortedGroup<T> students) {
		for (Iterator<T> iter = students.iterator(); iter.hasNext();) {
			T t = iter.next();
			System.out.println(t);
		}
	}
}