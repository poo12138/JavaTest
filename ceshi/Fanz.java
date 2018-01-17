package ceshi;

public class Fanz {
    /*
     * param A: A string
     * param offset: Rotate string with offset.
     * return: Rotated string.
     */
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

//        for(int i=0;i<=A.length;i++){
//            System.out.println(A[i]);
//        }
        return A;
    }

}
