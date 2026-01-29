package strings;

public class ReverseString {

	public static void main(String[] args) {
		revString("Ayzal");
	}

	public static void revString(String str) {
		int len = str.length();
		String rev = "";
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i); // i

		}
		System.out.println(rev);
	}

}
