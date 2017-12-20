package ceshi;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        //键盘录入数据
        System.out.println("请输入一个整数：(1~9)");
        int n = sc.nextInt();

        //调用功能，输出nn乘法表
        printNN(n);
    }

    /*
        输出对应的nn乘法表

        返回值类型：
            void
        参数列表：
            int n
    */
    public static void printNN(int n){
        for(int x=1; x<=n; x++) {
            for(int y=1; y<=x; y++) {
                System.out.print(y+"*"+x+"="+x*y+"\t");
            }
            System.out.println();
        }
    }
}