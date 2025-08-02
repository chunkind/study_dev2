package b01_thread.mini01;

public class MyArrayList<T> {
   public static final int STEP_NEXT = 2;
   private int size;
   private int capacity;
   private Object[] arr;

   public MyArrayList() {
      this.size = 0;
      this.capacity = 10;
      arr = new Object[capacity];
   }

   public boolean add(T data) {
      boolean result = false;

      if (size >= capacity) {
         capacity *= STEP_NEXT;
         Object[] newArr = new Object[capacity];
         for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
         }
         arr = newArr;
      }

      arr[size++] = data;

      return result;
   }

   public T get(int index) {
      return (T) arr[index];
   }

   public int size() {
      return size;
   }

   public int capacity() {
      return capacity;
   }

   public boolean remove(int index) {
      if (index < 0 || index > size - 1) {
         return false;
      }
      arr[index] = null;

      for (int i = index; i < size - 1; i++) {
         arr[i] = arr[i + 1];
      }

      size--;
      return true;
   }

   @Override
   public String toString() {
      String result = "";
      for (int i = 0; i < size; i++) {
         result += arr[i] + " ";
      }
      return result;
   }
}
