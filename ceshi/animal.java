package ceshi;

public class animal {
    int num=10;
    static int age=20;
    public void eat(){
        System.out.println("动物吃饭");
    }
    public static void sleep(){
        System.out.println("动物睡觉");

    }
    public void run(){
        System.out.println("动物跑步");
    }
}

class cat extends animal{
    int num=50;
    static int age =80;
    public void eat(){
        System.out.println("猫在吃饭");

    }
    public static void sleep(){
        System.out.println("猫在睡觉");

    }
    public void catchmouse(){
        System.out.println("猫在抓老鼠");

    }
}

class testDemo{
    public static void main(String[] args){
        animal am=new cat();
        cat ct=new cat();
        cat aa;
        aa=(cat)am;
        am.eat();
        am.sleep();
        ct.run();
        ct.eat();
        ct.sleep();
        ct.catchmouse();
        am.run();
        System.out.println(am.num);
        System.out.println(am.age);
        System.out.println(ct.num);
        System.out.println(ct.age);
        System.out.println(aa.num);
        System.out.println(aa.age);

    }
}