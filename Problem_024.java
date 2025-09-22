class Problem_024 {
    public String solution(String[] seoul) {
        int count = 0;
        for (String name : seoul) {
            if (name.equals("Kim")) break;
            count++;
        }

        return "김서방은 " + count + "에 있다";
    }
}