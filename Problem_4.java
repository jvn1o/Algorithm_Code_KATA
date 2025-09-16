public class Problem_4 {
    public int answer(int age) {
        int answer = 0;
        answer = yearOfBirth(age);
        return answer;
    }

    public int yearOfBirth(int age) {
        return 2022 - age + 1;
    }
}
