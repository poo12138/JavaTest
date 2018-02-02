package link;

public class BLsearch {
        /*
         * @param source: source string to be scanned.
         * @param target: target string containing the sequence of characters to match
         * @return: a index to the first occurrence of target in source, or -1  if target is not part of source.
         */
        public int strStr(String source, String target) {
            // write your code here
            int m=source.length();
            int n=target.length();

            for(int i=0;i<=m-n;i++){
                int j;
                for(j=0;j<n;j++){
                    if(source.charAt(i+j)!=target.charAt(j))
                        break;
                }
                if(j==n)
                    return i;

            }
            return -1;
        }
    public static void main(String[] args) {
        BLsearch bl=new BLsearch();
        String sourst="null";
        String target="u";
       int c=bl.strStr(sourst,target);
        System.out.println(c);
    }
}