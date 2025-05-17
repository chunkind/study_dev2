package b01_thread.step02;

/**
 * Run�� Start
 * Run -> �׳� �޼��� ����
 * Start -> �ٸ� �����带 ����� run�޼��� ����
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