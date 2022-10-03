public class Sum {
    public static void main(String[] args) {
        final int m = 8;
        final int n = 9;
        final double a = 4;
        final double b = 3;
        double sum = 0;
        for (double i = a; i <= n; i++){
            for (double j = b; j <= m; j++){
                if ((i+2) != 0) {
                    sum += (i-j) / (i+2);
                }
            }
        }
        System.out.println(sum);
    }
}