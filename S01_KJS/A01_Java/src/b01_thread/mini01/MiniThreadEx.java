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