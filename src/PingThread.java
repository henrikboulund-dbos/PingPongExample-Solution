public class PingThread extends Thread
{
    @Override
    public void run()  {
        while(true)
        {
            System.out.println("Ping");
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();;
            }
        }
    }
}
