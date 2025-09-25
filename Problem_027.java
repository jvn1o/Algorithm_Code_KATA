class Problem_027 {
    // 방법 1
    public String solution(String phone_number) {
        int len = phone_number.length();
        String answer = "*".repeat(len - 4) + phone_number.substring(len - 4);
        return answer;
    }

    // 방법 2
    public String solution2(String phone_number) {
        return phone_number.replaceAll(".(?=.{4})", "*");
    }
}