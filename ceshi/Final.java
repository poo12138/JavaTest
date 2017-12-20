package ceshi;
import java.util.*;

class Final {
    public void show() {
        //局部变量
        int num  = 10;
        System.out.println(num);
        num = 100;
        System.out.println(num);

        //final修饰局部变量
        final int num2 = 20;
        System.out.println(num2);
        //num2 = 200;
        System.out.println(num2);
    }

    public void method() {
        //局部变量
        Student s1 = new Student();
        System.out.println(s1.age);
        s1.age = 100;
        System.out.println(s1.age);

        //s1 = new Student();

        //final修饰局部变量
        final Student s2 = new Student();
        System.out.println(s2.age);
        s2.age = 100;
        System.out.println(s2.age);

        //s2 = new Student();
    }
}

class Student {
    int age = 10;
}

class FinalDemo2 {
    public static void main(String[] args) {
        Final p = new Final();
        p.show();
        p.method();
        String str = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
        String searchStr = "java";

        System.out.println(getCount1(str, searchStr));

        Integer i = 1;
        i += 1;

        Integer a = 100;
        Integer b = 100;

        Integer c = 200;
        Integer d = 200;

        System.out.println(a == b); //1
        System.out.println(a == 100); //2

        System.out.println(c == d); //3
        System.out.println(c == 200); //4
        System.out.println("max:" + Math.max(Math.max(24, 47), 23));
        List list=new ArrayList();
        list.add("a");
        list.add(1);
        list.add("c");
        list.add("d");

        List sub=list.subList(1,3);
        System.out.println(sub);
        //sub.clear();

        System.out.println(list);
        System.out.println(sub);

    }

        //从指定的字符串中查找小串出现的次数  方法1
        public static int getCount1(String str,String searchStr){
            int count=0;
            int searchStrlen=searchStr.length();
            while(str.indexOf(searchStr)!=-1){
                count++;
                str=str.substring(str.indexOf(searchStr)+searchStrlen);
            }
            return count;
        }

        //从指定的字符串中查找小串出现的次数  方法2
        public static int getCount2(String str,String searchStr){
            int count=0;
            int searchStrlen=searchStr.length();
            for(int i=0;i<str.length();i++){
                char temp=str.charAt(i);
                if(temp=='j'){
                    String strTemp=str.substring(i, i+searchStrlen);
                    if("java".equals(strTemp))
                        count++;
                }
            }
            return count;
        }
    }
