import java.util.Arrays;

public class Problem_012 {
    public double solution(int[] arr) {
        return Arrays.stream(arr).average().orElse(0);
    }
}
