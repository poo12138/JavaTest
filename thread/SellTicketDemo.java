package thread;

public class SellTicketDemo {
    public static void main(String[] args) {

        //创建资源对象
        SellTicket st = new SellTicket();

        //创建三个线程对象
        Thread t1 = new Thread(st,"窗口1");
        Thread t2 = new Thread(st,"窗口2");
        Thread t3 = new Thread(st,"窗口3");
//        t1.setPriority(5);
//        t2.setPriority(1);
//        t3.setPriority(3);
        int s=t1.getPriority();
        System.out.println(s);
        //启动线程
        t1.start();
        t2.start();
        t3.start();
    }
}
