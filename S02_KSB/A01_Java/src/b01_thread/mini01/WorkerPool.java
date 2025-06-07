package b01_thread.mini01;

public class WorkerPool {
	private MyQueue<Worker> workerQueue; // Worker 객체들을 담는 큐
	private int workerCount;             // Worker 개수

	public WorkerPool() {
		workerQueue = new MyQueue<Worker>(); // Worker 큐 생성
		Worker k = null;
		workerCount = 3;                     // Worker 3개 생성
		for(int i=0; i<workerCount; i++) {
			//System.out.println(i+" worker...");
			//k = new Worker();
			//workerQueue.enqueue(k);         // 큐에 추가
			String workerName = "Worker-" + (i + 1);
			Worker worker = new Worker(workerName);
			workerQueue.enqueue(worker);
		}
	}

	public void work() {
		while (workerQueue.size() > 0) {
			Worker worker = workerQueue.dequeue();        // 워커 꺼냄
			Thread t = new Thread(worker);                // 스레드 생성
			//t.setName("Worker-" + (int)(Math.random()*100)); // 스레드 이름 부여 (선택)
			t.setName(t.getName());
			t.start();                                    // 스레드 시작 (run() 실행)
		}
	}

}
