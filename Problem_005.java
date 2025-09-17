public class Problem_005 {
    public int solution(int num1, int num2) {
        int answer = 0;
        answer = Comparison(num1, num2);
        return answer;
    }

    public int Comparison(int num1, int num2) {
        return num1 == num2 ? 1 : -1;
    }
}
