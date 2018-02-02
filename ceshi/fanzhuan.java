package ceshi;

import link.Fanz;

public class fanzhuan {
        public static void main(String[] args) {
            Fanz fz = new Fanz();
            char[] a = {'a', 'b', 'c', 'd', 'e', 'f','a'};
            char[] c = null;

           c=fz.rotateString(a,3);
            for(int i=0;i<=c.length;i++){
         System.out.println(c[i]);
       }
            //System.out.println();


        }
}
