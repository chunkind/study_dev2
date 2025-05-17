package b01_thread.step02;

/**
 * Run과 Start
 * Run -> 그냥 메서드 실행
 * Start -> 다른 쓰레드를 만들어 run메서드 실행
 */
public class ThreadEx2 {
    public static void main(String[] args) {
        ThreadEx2_1 t = new ThreadEx2_1();
        t.start(); // main, run -> throwException
        t.run(); // main -> run -> throwException
    }
}

class ThreadEx2_1 extends Thread {
    @Override
    public void run() {
        throwException();
    }
    public void throwException(){
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}