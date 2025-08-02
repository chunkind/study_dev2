package b01_thread.mini01;

public class MiniThreadEx {
	public static MyQueue<Task> workQueue = new MyQueue<Task>();

	public static void main(String[] args) {
		// 작업큐 생성
		//for (int i = 0; i < 300; i++) {
			//workQueue.enqueue(new MyTask(i + " 번째 Task"));
		//}

		// 워커 쓰레드 10개 만들어서 시작
		// 구현...
		/*for (int i = 0; i < 3; i++) {
			Thread worker = new Thread(new Worker(), i + "번째 worker");
			worker.start();
		}*/

		// 작업 큐에 작업 100개 넣기
		for (int i = 0; i < 100; i++) {
			workQueue.enqueue(new MyTask(i + "번째 작업"));
		}

		// 워커풀 생성 및 실행
		WorkerPool pool = new WorkerPool();
		pool.work(); // 3명의 Worker가 병렬로 작업을 처리
	}
}