//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package link;

public class ProbabilityOfDice {
    private static int MAX = 6;

    public ProbabilityOfDice() {
    }

    public static void main(String[] args) {
        int n = 4;
        printProbabilityOfDice(n);
        System.out.println("============");
        printProbabilityOfDice2(n);
    }

    public static void printProbabilityOfDice(int n) {
        if (n >= 1) {
            double total = Math.pow((double)MAX, (double)n);
            int len = n * MAX - n * 1 + 1;
            int[] times = new int[len];

            int i;
            for(i = 1; i <= MAX; ++i) {
                probabilityOfDice(n, i, n, 0, times);
            }

            for(i = 0; i < len; ++i) {
                double p = (double)times[i] / total;
                System.out.println(i + n + ",  " + String.format("%.2f", p) + "/  " + total);
            }

        }
    }

    public static void probabilityOfDice(int n, int curDiceValue, int numOfDices, int curSum, int[] times) {
        int sum;
        if (numOfDices == 1) {
            sum = curSum + curDiceValue;
            ++times[sum - n];
        } else {
            sum = curSum + curDiceValue;

            for(int i = 1; i <= MAX; ++i) {
                probabilityOfDice(n, i, numOfDices - 1, sum, times);
            }
        }

    }

    public static void printProbabilityOfDice2(int n) {
        if (n >= 1) {
            double total = Math.pow((double)MAX, (double)n);
            int maxSum = n * MAX;
            double[][] f = new double[n + 1][n * MAX + 1];

            int k;
            for(k = 1; k <= MAX; ++k) {
                f[1][k] = 1.0D;
            }

            for(k = 2; k <= n; ++k) {
                for(int sum = n; sum <= maxSum; ++sum) {
                    for(int i = 1; sum - i >= 1 && i <= MAX; ++i) {
                        f[k][sum] += f[k - 1][sum - i];
                    }
                }
            }

            for(k = n; k <= maxSum; ++k) {
                double p = f[n][k] / total;
                System.out.println(k + ",  " + String.format("%.2f", p) + "/  " + total);
            }

        }
    }
}
