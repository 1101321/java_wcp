
public class Chapter08 {
	public static void main(String[] args) {
		// 1.「while」文
		int number = 1;
		while (number < 5) {
			System.out.println(number * number);
			number++;
		}
		
		// 2. 通常「for」文
		int array[] = { 0, 1, 2, 3 };
		for (int a = 0; a < array.length; a++) {
			System.out.println(array[a]);
		}
		
		// 3. 拡張「for」文
		for (int b : array) {
			if (b % 2 == 0) {
				continue;
			}
			System.out.println(b);
		}
	}
}