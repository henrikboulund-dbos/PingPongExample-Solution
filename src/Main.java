public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread ping = new PingThread();
        Thread pong = new PongThread();

        ping.start();
        Thread.sleep(500);
        pong.start();
    }
}