package c02_singly_linked_list;

public class SinglyLinkedList<T>{
    // Node를 새로 만들어 초기값을 셋팅후 리턴한다.
    // data는 받아온 newData
    // next는 null
    // 객체생성하여 위 두값으로 초기화후 리턴한다.
    Node<T> SLL_CreateNode(T newData){
        
        return null;
    }

    // head뒤에 newNode를 추가한다.
    void SLL_AppendNode(Node<T> head, Node<T> newNode){
        
    }

    // current 노드 뒤에 newNode 삽입.
    void SLL_InsertAfter(Node<T> current, Node<T> newNode){
        
    }

    // head 노드에 새로운 new head 노드 삽입
    void SLL_InsertNewHead(Node<T> head, Node<T> newHead){
        
    }

    // head 노드에 remove 노드 제거
    Node<T> SLL_RemoveNode(Node<T> head, Node<T> remove){
        
        return null;
    }

    // location에 있는 노드 반환
    Node<T> SLL_GetNodeAt(Node<T> head, int location){
        
        return null;
    }

    // head 노드의 갯수 반환
    int SLL_GetNodeCount(Node<T> head){
        
        return 0;
    }
}
