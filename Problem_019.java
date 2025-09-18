class Problem_019 {
    public long solution(long n) {
        // Math.sqrt(double a, double b)
        // a^b, a를 b제곱한다는 의미
        // double 로 return 해준다.

        // Math.sqrt(double a)
        // a의 제곱근
        // double 로 return 해준다.

        // n의 제곱근을 제곱하였을때 n일 경우, n + 1의 제곱을 return
        if (Math.pow((int)Math.sqrt(n), 2) == n) {
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        }

        return -1;
    }
}