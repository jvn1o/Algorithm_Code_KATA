public class Problem_7 {
    public int solution(int num1, int num2) {
        int answer = 0;
        answer = TheQuotientMultipliedBy1000(num1, num2);
        return answer;
    }

    public int TheQuotientMultipliedBy1000(int num1, int num2) {
        double answer = (double) num1 / (double) num2;
        return (int) (answer * 1000);
    }
}
