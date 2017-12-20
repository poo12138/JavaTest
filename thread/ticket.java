package thread;


public class ticket extends Thread {

    //定义一百张票，
    //为了让多个线程对象共享这100张票，我们其实应该用静态修饰
    private static int tickets = 100;

    public void run()
    {
        // 定义100张票
        // 每个线程进来都会走这里，这样的话，每个线程对象相当于买的是自己的那100张票，这不合理，所以应该定义到外面
        // int tickets = 100;
        //循环一直有票
        while(true)
        {
            if(tickets>0)
            {

                System.out.println( getName() + "正在售出第:"+(tickets--)+"张票");
            }
        }
    }
    public static void main(String[] args) {

        //创建三个线程共同卖票
        ticket s1 = new ticket();
        ticket s2 = new ticket();
        ticket s3 = new ticket();

        //给线程起名字
        s1.setName("窗口1");
        s2.setName("窗口2");
        s3.setName("窗口3");

        //开启线程
        s1.start();
        s2.start();
        s3.start();

    }
}