package b01_thread.mini01;

public class MyQueue<T> {
   private MyArrayList<T> arr;

   public MyQueue() {
      arr = new MyArrayList<T>();
   }

   // 담을수 있는 용량
   // 용량을 초과한다면 ?? => 용량을 2배로 늘려야한다
   public int capacity() {
      return arr.capacity();
   }

   // 현재 담겨져 있는 싸이즈
   public int size() {
      return arr.size();
   }

   // 큐에 맨 처음에 데이터 추가
   public void enqueue(T item) {
      arr.add(item);
   }

   // 큐에 맨 처음값 가져오기
   // 호출후에도 갯수는 변함 없다.
   public T peek() {
      return arr.get(0);
   }

   // 큐에 맨 처음값 가져오기
   // 호출하면 맨처음에 값은 사라진다.
   public T dequeue() {
      if (size() == 0) {
         System.err.println("비어있습니다.");
      }

      T result = arr.get(0);
      arr.remove(0);

      return result;
   }

   // 큐:: 선입선출(First In First Out)
   // 큐에 몇번째 위치에 있는지?
   // 제일 먼저 들어간 값이 위치가 1이다
   // 제일 나중에 들어간 값이 제일 높다
   // 못찾으면 -1 리턴
   public int search(T item) {
      int result = -1;// 못찾음

      for (int i = 0; i < size(); i++) {
         if (arr.get(i).equals(item)) {
            result = i + 1;
         }
      }

      return result;
   }

   // 값을 볼수 있게 toString 구현
   @Override
   public String toString() {
      return arr.toString();
   }
}