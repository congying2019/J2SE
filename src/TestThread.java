public class TestThread extends Thread {

    private  Integer ticket=100;

    @Override
    public void run() {
        while (true){
            if(ticket>0)
            System.out.println(Thread.currentThread().getName()+" is saling ticket "+ ticket--);
        }

    }
}

