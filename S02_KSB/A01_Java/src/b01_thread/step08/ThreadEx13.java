package b01_thread.step08;

import javax.swing.*;

/*
interrupt()는 쓰레드에게 작업을 멈추라고 요청한다. 
interrupted상태(인스턴스 변수)를 바꾸는 것일 뿐이다.

void interrupt()
쓰레드의 작업을 멈추라고 요청한다. (실제 멈추지 않음)
쓰레드의 interrupted 상태(인스턴스 변수)를 바꾸는 것일 뿐.(false -> true)

static boolean interrupted()
쓰레드에 대해 interrupt()가 호출되었는지 알려준다.
interrupt()가 호출되지 않았다면 false를 interrupt()가 호출되었다면 true를 반환.
쓰레드의 interrupted 상태를 false로 초기화 한다.

boolean isInterrupted()
쓰레드에 대해 interrupt()가 호출되었는지 알려준다.
쓰레드의 interrupted 상태를 초기화 하지 않는다.

쓰레드가 sleep(), wait(), join()에 의해 일시정지 상태(WAITING)에 있을때, 
해당 쓰레드에 대해 interrupt()를 호출하면, sleep(), wait(), join()에서 interrupted Exception이 발생하고 쓰레드는 실행대기 상태(RUNNABLE)로 바뀐다. 즉, 멈춰있던 쓰레드를 깨워서 실행가능한 상태로 만드는 것이다. 
*/
public class ThreadEx13 {
    public static void main(String[] args) {
        ThreadEx13_1 th1 = new ThreadEx13_1();
        th1.start();

        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력하신 값은 " + input + "입니다.");
        th1.interrupt(); // interrupt()를 호출하면, interrupted상태가 true가 된다.
        System.out.println("isInterrupted():" + th1.isInterrupted()); // true
    }
}

class ThreadEx13_1 extends Thread {
    @Override
    public void run() {
        int i = 100;

        while (i != 0 && !isInterrupted()) {
            System.out.println(i--);
            for(long x=0; x<2500000000L; x++); // 시간 지연
        }

        System.out.println("카운트가 종료 되었습니다.");
    }
}