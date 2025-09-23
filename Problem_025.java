import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Problem_025 {
    // 방법 1
    public int[] solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();
        for (int num : arr) {
            if (num % divisor == 0) {
                answer.add(num);
            }
        }

        if (answer.isEmpty()) {
            return new int[]{-1};
        }

        return answer.stream()
                .sorted()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    // 방법 2
    public int[] solution2(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr)
                            .sorted()
                            .filter(f -> f % divisor == 0)
                            .toArray();
        // 정렬이 우선적으로 진행되므로 더 느릴 수 있다.

        return answer.length == 0 ? new int[]{-1} : answer;
    }
}