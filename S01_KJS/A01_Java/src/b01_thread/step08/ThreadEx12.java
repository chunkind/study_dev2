package b01_thread.step08;

/**
 * 쓰레드 실행 제어
 * th1 을 2초 쉬었는데 왜 th1이 먼저 종료 되냐???
 *
 * :: sleep()이 항상 현재 실행 중인 쓰레드에 대해 작동하기 때문에 'th1.sleep(2000)' 과 같이
 * 호출하였어도 실제로 영향을 받는 것은 main 메서드를 실행하는 main 쓰레드이다.
 *
 * 그래서 sleep()은 static으로 선언되어 있으며 참조변수를 이용해서 호출하기 보다는
 * Thread.sleep(2000)과 같이 해야한다.
 */
public class ThreadEx12 {
    public static void main(String[] args) {
        ThreadEx12_1 th1 = new ThreadEx12_1();
        ThreadEx12_2 th2 = new ThreadEx12_2();

        th1.start();
        th2.start();

        try {
        	System.out.println("start");
//            th1.sleep(2000); // Thread.sleep(2000); 같은 코드
            Thread.sleep(2000);
            System.out.println("end");
        } catch (InterruptedException e) { }
    }
}

class ThreadEx12_1 extends Thread {
    @Override
    public void run() {
        for (int i=0; i<300; i++) {
            System.out.print("-");
        }

        try {
            sleep(2000); // Thread.sleep(2000); 같은 코드
        } catch (InterruptedException e) { }
        System.out.print("<<th1 종료>>");
    }
}

class ThreadEx12_2 extends Thread {
    @Override
    public void run() {
        for (int i=0; i<300; i++) {
            System.out.print("|");
        }
        System.out.print("<<th2 종료>>");
    }
}