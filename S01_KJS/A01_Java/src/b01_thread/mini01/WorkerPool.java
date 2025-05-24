package b01_thread.mini01;

public class WorkerPool {
	private MyQueue<Worker> workerQueue;
	private int workerCount;
	
	public WorkerPool() {
		workerQueue = new MyQueue<Worker>();
		Worker k = null;
		workerCount = 3;
		for(int i=0; i<workerCount; i++) {
			k = new Worker();
			workerQueue.enqueue(k);
		}
	}
	
	public void work() {
		
	}
}
