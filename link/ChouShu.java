package link;
import java.util.*;
import java.lang.*;

import static jdk.nashorn.internal.objects.NativeMath.min;
//public class ChouShu {
//        /*
//         * @param n: An integer
//         * @return: the nth prime number as description.
//         */
//        public int nthUglyNumber(int n) {//simple  Too low efficiency
//            int cs=n-1;
//            // write your code here
//            ArrayList<Integer> list=new ArrayList<Integer>();
//           // list.add(1);
//            int count=0;
//            int a;
//            int p=1;
//            while(count<n){
//                a=p;
//                while(a%2==0){
//                    a/=2;
//                }
//                while(a%5==0){
//                    a/=5;
//                }
//                while(a%3==0){
//                    a/=3;
//                }
//                if(a==1)
//                {
//                    list.add(p);
//                    count++;
//                }
//                p++;
//
//            }
//            int x=n-1;
//            int cs_=list.get(x);
////            System.out.println(list.size());
////            System.out.println(list.get(x));
//            return cs_;
//        }
//    public static void main(String[] args) {
//        int c;
//        ChouShu cs=new ChouShu();
//        c=cs.nthUglyNumber(1665);
//        System.out.println(c);
//
//    }
//    }

    /* improve algorithm
    * Assuming an array stores the sorted ugly numbers, then a new ugly number must be multiplied by 2, 3, or 5 in the array*/

public class ChouShu {
    /*
     * @param n: An integer
     * @return: the nth prime number as description.
     */
    public int nthUglyNumber(int n) {
        if(n==0)
            return 0;
        int[] a = new int[n];
        int count = 1;
        a[0] = 1;
        int index2 = 0;
        int index3 = 0;
        int index5 = 0;
        while(count<n){
            int x=a[index2]*2;
            int y=a[index3]*3;
            int z=a[index5]*5;
            int min = min(x,y,z);
            a[count] = min;
            while(a[index2]*2<=a[count]) index2++;
            while(a[index3]*3<=a[count]) index3++;
            while(a[index5]*5<=a[count]) index5++;
            count++;
        }
        int result = a[n-1];
        return result;
    }
    public int min(int a,int b,int c){
        int temp = a>b?b:a;
        return temp>c?c:temp;
    }

    public static void main(String[] args) {
        int c;
        ChouShu cs=new ChouShu();
        c=cs.nthUglyNumber(1665);
        System.out.println(c);

    }
}