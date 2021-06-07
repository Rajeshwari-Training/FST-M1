/**
 * 
 */
package activities;

/**
 * @author 04108E744
 *
 */
public class Activity2 {

	public static void main(String args[]) {

		int[] array = { 10, 77, 10, 54, -11, 10 };
		int addedTens = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 10) {
				addedTens = array[i] + addedTens;
			}
		}
		if (addedTens == 30)
			System.out.println("Total of tens " + addedTens);
	}
}
