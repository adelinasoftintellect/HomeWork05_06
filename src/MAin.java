
public class MAin {

	public static void main(String[] args) {
		int[] a = { 4, 5, 7, 8, 9 };
		printArray(a);
	}

	private static void printArray(int[] b) {
		for (int i = b.length - 1; i >= 0; i--) {
			System.out.print(b[i] + " ");
		}
	}
}
