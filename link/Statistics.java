//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package link;

public class Statistics {
    public Statistics() {
    }

    public int digitCounts(int k, int n) {
        int count = 0;
        int singlecount = 0;
        int p = n;
        int num = 0;
        if (k == 0) {
            return n / 10 + 1;
        } else if (n == 0) {
            return 0;
        } else {
            while(p != 0) {
                if (p % 10 > k) {
                    singlecount = (int)((double)(p / 10 + 1) * Math.pow(10.0D, (double)num));
                }

                if (p % 10 == k) {
                    singlecount = (int)((double)(p / 10) * Math.pow(10.0D, (double)num) + (double)n % Math.pow(10.0D, (double)num) + 1.0D);
                }

                if (p % 10 < k) {
                    singlecount = (int)((double)(p / 10) * Math.pow(10.0D, (double)num));
                }

                count += singlecount;
                p /= 10;
                ++num;
            }

            return count;
        }
    }

    public static void main(String[] args) {
        Statistics st = new Statistics();
        int a = st.digitCounts(1, 20);
        System.out.println(a);
    }
}

