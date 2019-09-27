public class TestRunnable implements Runnable {

    private Integer ticket = 100;

    @Override
    public void run() {
        while (ticket > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (""){
                System.out.println(Thread.currentThread().getName() + " is saling ticket " + ticket--);
            }
        }
    }
}
