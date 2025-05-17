package c01_dynamic_array;

public class DynamicArrayTest {
	public static void main(String[] args) {
		DynamicArray<Integer> list = new DynamicArray<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);
        System.out.println(list.size());

        list.remove(3); // index로 삭제 숫자 4가 삭제되어야함
        System.out.println(list);
        System.out.println(list.size());


    }
}
