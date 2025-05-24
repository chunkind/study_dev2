package b01_thread.mini01;

public class MyTask implements Task {
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