import java.util.stream.Longstream;

class Problem_022 {
    public long solution(int a, int b) {
        return LongStream.rangeClosed(Math.min(a,b), Math.max(a,b)).sum();
    }
}