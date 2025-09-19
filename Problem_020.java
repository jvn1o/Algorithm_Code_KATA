import java.util.*;

class Problem_020 {
    // 방법 1
    public long solution(long n) {
        String str = String.valueOf(n);
        int[] arr = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - '0';
        }

        Arrays.sort(arr);

        StringBuilder reverse = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            reverse.append(arr[i]);
        }

        return Long.parseLong(reverse.toString());
    }

    // 방법 2
    public long solution(long n) {
        return Long.parseLong(
                String.valueOf(n)
                        .chars()                          // 각 문자를 int 스트림으로
                        .mapToObj(c -> (char) c)          // 문자 스트림으로 변환
                        .sorted(Comparator.reverseOrder())// 내림차순 정렬
                        .collect(StringBuilder::new,      // 문자열 합치기
                                StringBuilder::append,
                                StringBuilder::append)
                        .toString()
        );
    }
}