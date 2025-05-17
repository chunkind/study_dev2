package c01_dynamic_array;

public class DynamicArray<T> {
	public static final int STEP_NEXT = 2;
    private int size; // 크기 :: 실제 요소가 몇개 있는지
    private int capacity; // 용량:: 얼마만큼 요소가 들어갈수 있는지
    private Object[] arr;

    // 초기화
    // size = 0, capacity = 5, arr도 capacity만큼 생성
    public DynamicArray() {
        
    }

    // 요소 T arr에 추가
    // 용량 부족하면 현재 용량 * STEP_NEXT 만큼 새로 생성해서 데이터 복사
    public boolean add(T data){
        
        return false;
    }

    // arr의 index 번째 리턴
    public T get(int index){
    	
        return null;
    }

    // 요소들의 크기 (capacity와 다름)
    public int size(){
        return size;
    }

    // index 요소 삭제
    public boolean remove(int index){
        if(index < 0 || index > size - 1){
            return false;
        }
        arr[index] = null;

        for(int i=index; i<size-1; i++){
            arr[i] = arr[i+1];
        }

        size--;
        return true;
    }
    
    // arr에 요소 모두 출력
    // ex) 0 1 2 3 4 5
    @Override
    public String toString() {
        
        return null;
    }
}
