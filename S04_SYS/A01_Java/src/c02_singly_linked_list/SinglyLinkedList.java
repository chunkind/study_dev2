package c02_singly_linked_list;

public class SinglyLinkedList<T> {

    // Node 객체를 만들어 반환
    public Node<T> SLL_CreateNode(T NewData) {
        Node<T> newNode = new Node<T>(NewData);
        return newNode;
    }

    //   // Head 노드에 새로운 노드 추가
    public void SLL_AppendNode(Node Head, Node NewNode) {
        Node<T> current = Head;

        while (current.nextNode != null) {
            current = current.nextNode;
        }

        current.nextNode = NewNode;
    }

//    //   // Current 노드 뒤에 새로운 노드 삽입
//    public void SLL_InsertAfter(Node Current, Node NewNode) {
//        NewNode.nextNode = Current.nextNode;
//        Current.nextNode = NewNode;
//    }
//
//    //   // Head 노드에 새로운 노드를 삽입
//    public Node SLL_InsertNewHead(Node Head, Node NewHead) {
//        NewHead.nextNode = Head;
//        return NewHead;
//    }
//
//    //   // Head 노드에서 Remove 노드 제거
//    public void SLL_RemoveNode(Node Head, Node Remove) {
//        Node<T> current = Head;
//
//        while (current != null && current.nextNode != null) {
//            if (current.nextNode == Remove) {
//                current.nextNode = Remove.nextNode;
//                break;
//            }
//            current = current.nextNode;
//        }
//    }
//
//    //   // Location 위치에 있는 노드 반환
//    public Node SLL_GetNodeAt(Node Head, int Location) {
//        Node<T> current = Head;
//        for (int i = 0; i < Location && current != null; i++) {
//            current = current.nextNode;
//        }
//        return current;
//    }
//
//    //   // Head 노드의 노드 개수 반환
//    public int SLL_GetNodeCount(Node Head) {
//        int cnt = 0;
//
//        Node<T> current = Head;
//
//        while (current != null) {
//            cnt++;
//            current = current.nextNode;
//        }
//
//        return cnt;
//    }
}
