package b01_thread.mini01;

public class MiniThreadEx {
	public static MyQueue<Task> workQueue = new MyQueue<Task>();

	public static void main(String[] args) {
		// 작업큐 생성
		for (int i = 0; i < 300; i++) {
			workQueue.enqueue(new MyTask(i + " 번째 Task"));
		}

		// 워커 쓰레드 10개 만들어서 시작
		// 구현...
		for (int i = 0; i < 3; i++) {
			Thread worker = new Thread(new Worker(), i + "번째 worker");
			worker.start();
		}
	}
}

// 구현...
class Worker implements Runnable {
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

interface Task {
	void execute();
}

class MyTask implements Task {
	private String taskName;

	public MyTask(String taskName) {
		this.taskName = taskName;
	}

	@Override
	public void execute() {
		System.out.println(taskName + " 처리중..");
		try {
			Thread.sleep(1000 * 1); // 10초걸리는작업...
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}