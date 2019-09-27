import sort.sort;

public class Main {

    public static void main(String[] args) {

//        Thread t=new TestThread();
//        t.start();
//        t.start();
//        t.start();
//        t.start();

//        TestRunnable t=new TestRunnable();
//        new Thread(t).start();
//        new Thread(t).start();
//        new Thread(t).start();
//        new Thread(t).start();
//        new Thread(t).start();
        Integer[] array = new Integer[5];
        array[0] = 2;
        array[1] = 5;
        array[2] = 3;
        array[3] = 5;
        array[4] = 8;
        sort.sort1(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
