package b01_thread.step07;

/**
 * 데몬 쓰레드
 * boolean isDeamon() - 쓰레드가 데몬 쓰레드인지 확인한다. 데몬 쓰레드이면 true를 반환한다.
 * void setDeamon(boolean on) - 쓰레드를 데몬 쓰레드로 또는 사용자 쓰레드로 변경한다.
 *                              매개변수 on의 값을 true로 지정하면 데몬 쓰레드가 된다.
 *
 */
public class ThreadEx10 implements Runnable{
    static boolean autoSave = false;

    public static void main(String[] args) {
        Thread t = new Thread(new ThreadEx10());
        t.setDaemon(true); // 이 부분이 없으면 종료되지 않는다.
        t.start();

        for (int i=0; i<=10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) { }
            System.out.println(i);

            if(i == 5)
                autoSave = true;
        }

        System.out.println("프로그램을 종료합니다.");
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3 * 1000); // 3초마다
            } catch (InterruptedException e) { }

            // autoSave의 값이 true이면 autoSave()를 호출한다.
            if (autoSave) {
                autoSave();
            }
        }
    }

    public void autoSave() {
        System.out.println("작업파일이 자동 저장 되었습니다.");
    }
}
