class Problem_026 {
    // 방법 1
    public int solution1(int[] absolutes, boolean[] signs) {
        int posNumSum = 0;
        int negNumSum = 0;

        for (int i=0; i < absolutes.length; i++) {
            if(signs[i] == true) posNumSum += absolutes[i];
            else negNumSum -= absolutes[i];
        }

        int answer = posNumSum + negNumSum;
        return answer;
    }

    // 방법 2
    public int solution2(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < signs.length; i++)
            answer += absolutes[i] * (signs[i] ? 1 : -1);
        return answer;
    }
}