public class Problem_013 {
    public int solution(int n) {
        int answer = 0;
        answer = digitSum(n);
        return answer;
    }

    public int digitSum(int n) {
        return String.valueOf(n)
                .chars()
                .map(c -> c - '0')
                .sum();
    }
}