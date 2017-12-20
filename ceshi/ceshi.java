package ceshi;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class ceshi {
    public void giveyoulove(int tempreature, int sa) {}

    public static int[] generateRandomNumber(int begin, int end, int size) {
        if (begin >= end || (end - begin) < size) {
            return null;
        }
        int[] seed = new int[end - begin];
        for (int i = begin; i < end; i++) {
            seed[i - begin] = i;
        }
        int[] ranArr = new int[size];
        Random ran = new Random();
        for (int i = 0; i < size; i++) {
            int j = ran.nextInt(seed.length - i);
            ranArr[i] = seed[j];
            seed[j] = seed[seed.length - 1 - i];
        }
        return ranArr;
    }
    public static int add(int x,int ...args){
        int sum=x;
        for(int i=0;i<args.length;i++){
            sum+=args[i];
        }
        return sum;
    }

    public static void main(String[] args) {
//        byte b1=3,b2=4,b;
//        b= b1+b2;
//        b=3+4;




        int[] ranArr = {};
        int red;
        Scanner input = new Scanner(System.in);
        Random ran = new Random();
        System.out.println("欢迎使用双色球自动摇号系统");
        System.out.print("确实摇号(y/n)?");
        String go;
        go = input.next();
        while (go.equalsIgnoreCase("y")) {
            ranArr = generateRandomNumber(1, 33, 6);
            red = ran.nextInt(16);
            System.out.println(Arrays.toString(ranArr) + "" + red);
            System.out.print("继续摇号(y/n)?");
            go = input.next();
        }
        System.out.println("谢谢使用！");

        System.out.println('a');
        System.out.println('a'+1);

        System.out.println("hello"+'a'+1);
        System.out.println('a'+1+"hello");
        System.out.println("5+5="+5+5);
        System.out.println(5+5+"=5+5");
        System.out.println(" "+'a'+1);
        int a=1,b=2;
        int c=(a+b>3?a++:++b);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("-------------------------");

        System.out.println(add(2,3));
        System.out.println(add(2,3,5));

    }
}



