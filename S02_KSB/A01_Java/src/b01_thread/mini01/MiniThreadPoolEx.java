package b01_thread.mini01;

public class MiniThreadPoolEx {
	public static MyQueue<Task> workQueue = new MyQueue<>();

    public static void main(String[] args) {
       
    }
}

// 기존 큐에서 작업을 꺼내 실행하는 스레드 풀용 워커
class WorkerPool implements Runnable {
    private final String name;

    public WorkerPool(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            Task task = null;
            synchronized (MiniThreadPoolEx.workQueue) {
                if (MiniThreadPoolEx.workQueue.size() > 0) {
                    task = MiniThreadPoolEx.workQueue.dequeue();
                } else {
                    break;
                }
            }

            if (task != null) {
                System.out.println(name + " 작업 시작");
                task.execute();
                System.out.println(name + " 작업 완료");
            }
        }
    }
}