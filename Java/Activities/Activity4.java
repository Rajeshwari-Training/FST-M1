/**
 * 
 */
package activities;

/**
 * @author 04108E744
 *
 */
public class Activity4 {

	public static void main(String args[]) {

		int[] randomArray = { 10, 6, 22, 8, 13, 2, 78 };
		int temp = 0;
		for (int i = 0; i < randomArray.length; i++) {
			System.out.println("Before Sort :");
			System.out.println(randomArray[i]);
		}
		for (int i = 0; i < randomArray.length; i++) {
			for (int j = i + 1; j < randomArray.length; j++) {
				if (randomArray[i] > randomArray[j]) {
					temp = randomArray[i];
					randomArray[i] = randomArray[j];
					randomArray[j] = temp;
				}
			}
		}

		for (int i = 0; i < randomArray.length; i++) {
			System.out.println("Sorted numbers :");
			System.out.println(randomArray[i]);
		}

	}
}
