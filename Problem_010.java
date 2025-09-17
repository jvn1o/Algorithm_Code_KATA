import java.util.Arrays;

public class Problem_010 {
    public double solution(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
    }
}
