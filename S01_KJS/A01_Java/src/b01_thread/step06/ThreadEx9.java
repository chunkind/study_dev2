package b01_thread.step06;

/**
 * 쓰레드 그룹
 *
 * ThreadGroup getThreadGroup() - 쓰레드 자신이 속한 쓰레드 그룹을 반환한다.
 * void uncaughtException(Thread t, Throwable e) - 쓰레드 그룹의 쓰레드가, 처리되지 않은 예외에
 * 의해 실행이 종료되었을 때, JVM에 의해 이 메서드가 자동적으로 호출된다.
 */
public class ThreadEx9 {
    public static void main(String[] args) {
        ThreadGroup main = Thread.currentThread().getThreadGroup();
        ThreadGroup grp1 = new ThreadGroup("Group1");
        ThreadGroup grp2 = new ThreadGroup("Group2");

        // ThreadGroup(ThreadGroup parent, String name)
        ThreadGroup subGrp1 = new ThreadGroup(grp1, "SubGroup1");

        grp1.setMaxPriority(3); // 쓰레드 그룹 grp1의 최대우선순위를 3으로 변경.

        Runnable r = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000); // 쓰레드를 1초간 멈추게 한다.
                } catch (InterruptedException e) { }
            }
        };

        // Thread(ThreadGroup tg, Runnable r, String name)
        new Thread(grp1, r, "th1").start();
        new Thread(subGrp1, r, "th2").start();
        new Thread(grp2, r, "th3").start();

        System.out.println(
                  ">>List of ThreadGroup : " + main.getName()
                + ", Active ThreadGroup : " + main.activeGroupCount()
                + ", Active Thread : " + main.activeCount()
        );

        main.list();
    }
}
