/**
 * 
 */
package activities;

/**
 * @author 04108E744
 *
 */
abstract class Book {
	String title;

	abstract void setTitle(String title);

	String getTitle() {
		return title;
	}
}

class MyBook extends Book {

	void setTitle(String s) {
		title = s;
	}
}

public class Activity5 {

	public static void main(String args[]) {
		MyBook newNovel = new MyBook();
		String title = "Harry potter";
		// Set title
		newNovel.setTitle(title);

		// Print result
		System.out.println("The title is: " + newNovel.getTitle());
	}
}
