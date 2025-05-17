package b01_thread.step01;

/**
 * 쓰레드의 생성방법
 * 1. Thread 클래스 상속
 * 2. Runable 인터페이스 구현 클래스 사용
 */
public class ThreadEx1 {
    public static void main(String[] args) {
        ThreadEx1_1 t1 = new ThreadEx1_1();

        Runnable r = new ThreadEx1_2();
        Thread t2 = new Thread(r);

        /*Runnable r2 = new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<5; i++){
                    Thread t = Thread.currentThread();
                    System.out.println(t.getName());
                }
            }
        };*/
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<5; i++){
                    Thread t = Thread.currentThread();
                    System.out.println(t.getName());
                }
            }
        });

        Thread t4 = new Thread(() -> {
            for(int i=0; i<5; i++){
                Thread t = Thread.currentThread();
                System.out.println(t.getName());
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

class ThreadEx1_1 extends Thread {
    @Override
    public void run() {
        for(int i=0; i<5; i++){
            System.out.println(getName());
        }
    }
}

class ThreadEx1_2 implements Runnable {
    @Override
    public void run() {
        for(int i=0; i<5; i++){
            Thread t = Thread.currentThread();
            System.out.println(t.getName());
        }
    }
}
