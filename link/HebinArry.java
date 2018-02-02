package link;
import java.util.*;

public class HebinArry {
        /*
         * @param A: sorted integer array A
         * @param B: sorted integer array B
         * @return: A new sorted integer array
         */
        public ArrayList<Integer> mergeSortedArray(int[] A, int[] B) {
            // write your code here
            ArrayList<Integer> list=new ArrayList<Integer>();
            int i=0,j=0;
            while(i<A.length&&i<B.length){
                if(A[i]>B[j]){
                    list.add(B[j]);
                    j++;

                }
                else {
                    list.add(A[i]);
                    i++;
                }
            }
            while(i<A.length){
                list.add(A[i]);
                i++;

            }
            while(j<B.length) {
                list.add(B[j]);
                j++;
            }

            for(int item:list){
                System.out.print(item+" ,");
            }
            return list;
        }
    public static void main(String[] args) {
        int[] A={1,2,3,4,5,6};
        int[] B={4,5,6,6,7,8,9};
        HebinArry cs=new HebinArry();
        cs.mergeSortedArray(A,B);
       // System.out.println(cs);


    }
}

