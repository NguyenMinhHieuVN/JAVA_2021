package PingPong;

public class PingPong
{
    public static void main(String[] args)
    {
        Object lock = new Object();
        Thread ping = new Thread(new PingPongThread(lock, "Ping"));
        Thread pong = new Thread(new PingPongThread(lock, "Pong"));
        ping.start();
        pong.start();
    }
}
class PingPongThread implements Runnable
{
    private Object lock;
    private String name;
    public PingPongThread(Object lock, String name)
    {
        this.lock = lock;
        this.name = name;
    }
    @Override
    public void run()
    {
        synchronized (lock)
        {
            while(true)
            {
                System.out.println(name);
                try
                {
                    Thread.sleep(1000);
                } catch (Exception e)
                {
                    e.printStackTrace();
                }
                lock.notify();
                try
                {
                    lock.wait(1000);
                } catch (Exception e1)
                {
                    e1.printStackTrace();
                }
            }
        }
    }
}