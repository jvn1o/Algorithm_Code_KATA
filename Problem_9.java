import java.util.stream.IntStream;

public class Problem_9 {
    public int solution(int n) {
        return IntStream.rangeClosed(0, n)
                .filter(e -> e % 2 == 0)
                .sum();
    }
}
