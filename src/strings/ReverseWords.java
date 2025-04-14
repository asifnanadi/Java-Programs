package strings;

public class ReverseWords {

	public static void reverseWords() {
		String str = "My name is Asif";
		String StringArr[] = str.split(" ");
		System.out.println(StringArr.length);

		for (int i = StringArr.length - 1; i >= 0; i--) {
			System.out.print(StringArr[i]);
			System.out.print(" ");
		}

	}

	public static void main(String[] args) {
		reverseWords();
	}

}
