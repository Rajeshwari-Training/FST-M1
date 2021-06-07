/**
 * 
 */
package activities;

import java.util.ArrayList;

/**
 * @author 04108E744
 *
 */
public class Activity9 {

	public static void main(String args[]) {

		ArrayList myList = new ArrayList();

		myList.add("John");
		myList.add("Peter");
		myList.add("Walker");
		myList.add("Merry");
		myList.add("Baptist");

		for (int i = 0; i < myList.size(); i++) {
			System.out.println("Mylist Values:" + myList.get(i));
		}

		System.out.println("Mylist 3rd Value:" + myList.get(2));

		for (int i = 0; i < myList.size(); i++) {
			if (myList.contains("Baptist")) {
				System.out.println("Mylist contains Value:" + myList.get(i));
			}
		}

		myList.remove(2);
		System.out.println("Mylist size:" + myList.size());
	}

}
