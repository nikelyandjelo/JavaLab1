public class mat {
    public static void main(String[] args) {
        final float[][] firstMa =
                        {{3, 4, 2},
                        {3, 4, 5},
                        {2, 4, 7},
                        {8, 2, 5}};

        final float[][] secondMa =
                        {{6, 7, 3, 5},
                        {3, 5, 7, 8},
                        {5, 3, 8, 6}};
        float sum = 0;
        final int m = firstMa.length;
        final int n = secondMa[0].length;
        float[][] res = new float[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                for (int k = 0; k < firstMa[0].length; k++) {
                    res[i][j] = res[i][j] + firstMa[i][k] * secondMa[k][j];
                }
        }
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.printf("%10f", res[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            float smallest = res[0][i];
            float biggest = 0;
            for (int j = 0; j < m; j++) {
                if (j % 2 != 0) {
                    if (res[j][i] > biggest) {
                        biggest = res[j][i];
                    }
                }
                else {
                    if (res[j][i] <= smallest){
                        smallest = res[j][i];
                    }
                }
            }
            sum += biggest + smallest;
        }
        System.out.printf("Cума:%f", sum);
    }
}
