import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Problem_017 {
    // 방법 1
    public int[] solution(long n) {
        int length = Long.toString(n).length();
        int[] answer = new int[length];

        for (int i = 0; i < length; i++) {
            answer[i] = (int) (n % 10);
            n /= 10;
        }

        return answer;
    }

    // 방법 2
    public int[] solution2(long n) {
        List<Integer> list = String.valueOf(n)
                .chars()
                .map(c -> c - '0')
                .boxed()
                .collect(Collectors.toList());

        Collections.reverse(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}