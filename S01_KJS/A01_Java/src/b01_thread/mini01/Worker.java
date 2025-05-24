package b01_thread.mini01;

public class Worker implements Runnable {
	@Override
	public void run() {
		while (true) {
			Task task = null;
			synchronized (MiniThreadEx.workQueue) {
				if (MiniThreadEx.workQueue.size() > 0) {
					task = MiniThreadEx.workQueue.dequeue();
				}
			}

			if (task != null) {
				System.out.println(Thread.currentThread().getName() + " 작업 시작");
				task.execute();
				System.out.println(Thread.currentThread().getName() + " 작업 완료");
			} else {
				break;
			}
		}
	}
}