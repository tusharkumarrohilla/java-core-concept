package Threads;

public class ThreadTester {


    public void test(){
        Thread t = new Thread(new RunnableThread());
        t.start();
    }
}
