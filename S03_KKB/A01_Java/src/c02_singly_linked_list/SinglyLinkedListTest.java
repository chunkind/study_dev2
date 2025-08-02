package c02_singly_linked_list;

public class SinglyLinkedListTest {
    public static void main(String[] args) {
        int i = 0;
        int count = 0;
        Node<Integer> list = new Node<Integer>();
        Node<Integer> current = null;
        Node<Integer> newNode = null;

        SinglyLinkedList<Integer> obj = new SinglyLinkedList<Integer>();

        // 노드 5개 추가
        for (i = 0; i < 5; i++) {
            newNode = (Node<Integer>) obj.SLL_CreateNode(i);
            obj.SLL_AppendNode(list, newNode);
        }

        newNode = obj.SLL_CreateNode(-1);
        obj.SLL_InsertNewHead(list, newNode);

        newNode = obj.SLL_CreateNode(-2);
        obj.SLL_InsertNewHead(list, newNode);

        // 리스트 출력
        count = obj.SLL_GetNodeCount(list);
        for (i = 0; i < count; i++) {
            current = obj.SLL_GetNodeAt(list, i);
            System.out.printf("List[%d] : %d\n", i, current.data);
        }

        // 리스트의 세 번째 노드 뒤에 새 노드 삽입
        System.out.printf("\nInserting 3000 After [2]...\n\n");

        current = obj.SLL_GetNodeAt(list, 2);
        newNode = obj.SLL_CreateNode(3000);

        obj.SLL_InsertAfter(current, newNode);

        // 리스트 출력
        count = obj.SLL_GetNodeCount(list);
        for (i = 0; i < count; i++) {
            current = obj.SLL_GetNodeAt(list, i);
            System.out.printf("List[%d] : %d\n", i, current.data);
        }

        // 요소 하나만 제거
        System.out.printf("\nDestroying 3000...\n");
        list = obj.SLL_RemoveNode(list, newNode);

        // 리스트 출력
        count = obj.SLL_GetNodeCount(list);
        for (i = 0; i < count; i++) {
            current = obj.SLL_GetNodeAt(list, i);
            System.out.printf("List[%d] : %d\n", i, current.data);
        }

        // 모든 노드를 메모리에서 제거
        System.out.printf("\nDestroying List...\n");
        for (i = 0; i < count; i++) {
//            current = obj.SLL_GetNodeAt(?, ?);
            current = obj.SLL_GetNodeAt(list, 0);
            if (current != null) {
                list = obj.SLL_RemoveNode(list, current);
            }
        }

        // 리스트 출력
        count = obj.SLL_GetNodeCount(list);
        for (i = 0; i < count; i++) {
            current = obj.SLL_GetNodeAt(list, i);
            System.out.printf("List[%d] : %d\n", i, current.data);
        }
    }
}