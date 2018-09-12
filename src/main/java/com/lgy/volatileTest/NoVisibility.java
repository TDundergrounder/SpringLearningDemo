package com.lgy.volatileTest;

/**
 * @author l
 */
public class NoVisibility {
    private static boolean ready;
    private static int number;

    private static class ReaderThread extends Thread {
        @Override
        public void run() {
            while (!ready) {
                Thread.yield();
            }
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        try {
            new ReaderThread().start();
            Thread.sleep(1000);
            number = 42;
            ready = true;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}


//public class NoVisibility extends Thread {
//
//    public NoVisibility(String name) {
//        super(name);
//    }
//
//    @Override
//    public void run() {
//        for (int i = 1; i <= 50; i++) {
//            System.out.println("" + this.getName() + "-----" + i);
//            // 当i为30时，该线程就会把CPU时间让掉，让其他或者自己的线程执行（也就是谁先抢到谁执行）
//            if (i == 30) {
//                this.yield();
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        NoVisibility yt1 = new NoVisibility("张三");
//        NoVisibility yt2 = new NoVisibility("李四");
//        yt1.start();
//        yt2.start();
//    }
//}

