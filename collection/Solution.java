package collection;
import java.util.*;
public class Solution {
    public char[] rotateString(char[] A, int offset) {
        if (null == A || A.length == 0) return A;
        offset = offset % A.length;
        for (int i = 0; i < A.length / 2; i++) {//整个字符串翻转
            char c = A[i];
            A[i] = A[A.length - 1 - i];
            A[A.length - 1 - i] = c;
        }
        for (int i = 0; i < offset / 2; i++) {//offset部分翻转
            char c = A[i];
            A[i] = A[offset - 1 - i];
            A[offset - 1 - i] = c;
        }
        for (int i = 0; i < (A.length - offset + 1) / 2; i++) {//剩余部分翻转
            char c = A[offset + i];
            A[offset + i] = A[A.length - 1 - i];
            A[A.length - 1 - i] = c;
        }
        return A;
    }

    public static void main(String[] args) {
        Solution Sol = new Solution();
        char[] s = {'a', 's', 'a', 'q', 's', 'a','q'};
        char[] a = Sol.rotateString(s, 3);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
//public class Solution {
//    /*
//     * @param A: sorted integer array A
//     * @param B: sorted integer array B
//     * @return: A new sorted integer array
//     */
//    public ArrayList<Integer> mergeSortedArray(int[] A, int[] B) {
//        // write your code here
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        int i = 0, j = 0;
//        while (i < A.length&& i < B.length) {
//            if (A[i] > B[j]) {
//                list.add(B[j]);
//                j++;
//
//            } else {
//                list.add(A[i]);
//                i++;
//            }
//        }
//        while (i < A.length) {
//            list.add(A[i]);
//            i++;
//
//        }
//        while (j < B.length) {
//            list.add(B[j]);
//            j++;
//        }
//        return list;
//    }
//    public static void main(String[] args) {
//        int[] A = {2, 5, 6, 7};
//        int[] B = {1, 5, 8, 9};
//        Solution a=new Solution();
//        ArrayList<Integer> arr =a.mergeSortedArray(A,B);
//
//        for (int i = 0; i < arr.size(); i++) {
//            System.out.println(arr.get(i));
//        }
//    }
//}
