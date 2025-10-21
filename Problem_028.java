import java.util.*;

public class Problem_028 {
	public int solution1(int[] numbers) {
		int sum = 0;

		for (int i = 0; i < 10; i++) {
			boolean exist = false;
			for (int num : numbers) {
				if (num == i) {
					exist = true;
					break;
				}
			}
			if (!exist) sum += i;
		}

		return sum;
	}

	public int solution2(int[] numbers) {
		return 45 - Arrays.stream(numbers).sum();
	}
}
