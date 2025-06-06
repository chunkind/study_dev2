package b01_thread.step08;

public class ThreadEx19 {
    static long startTime = 0;

    public static void main(String[] args) {
        ThreadEx19_1 th1 = new ThreadEx19_1();
        ThreadEx19_2 th2 = new ThreadEx19_2();
        th1.start();
        th2.start();
        startTime = System.currentTimeMillis();

        try{
            th1.join(); // main 쓰레드가 th1의 작업이 끝날 때까지 기다린다.
            th2.join(); // main 쓰레드가 th2의 작업이 끝날 때까지 기다린다.
        } catch (InterruptedException e) { }

        System.out.print("소요시간:" + (System.currentTimeMillis() - startTime));
    }
}

class ThreadEx19_1 extends Thread {
    @Override
    public void run() {
        for (int i=0; i<3000; i++) {
            System.out.print(new String("-"));
        }
    }
}

class ThreadEx19_2 extends Thread {
    @Override
    public void run() {
        for (int i=0; i<3000; i++){
            System.out.print(new String("|"));
        }
    }
}