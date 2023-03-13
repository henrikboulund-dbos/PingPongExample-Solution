public class PongThread extends Thread
{
    @Override
    public void run()  {
        while(true)
        {
            System.out.println("Pong");
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();;
            }
        }
    }
}
