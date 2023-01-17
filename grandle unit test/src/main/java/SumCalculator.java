public class SumCalculator {
    int sum(int n){
        if (n == 0){
            throw new IllegalArgumentException();
        }
        else {
            int result = 0;
            for (int i = 1; i <= n; i++) {
                result = result + i;
            }
            return result;
        }
    }
}
