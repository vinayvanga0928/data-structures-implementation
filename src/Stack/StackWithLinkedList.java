package Stack;

public class StackWithLinkedList {

    Node head;
    int size;

    public StackWithLinkedList(){
        this.head = null;
        size = 0;
    }

    public void push(int value){
        Node node = new Node();
        node.value = value;
        if(head == null){
            node.next = null;
            head = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    public int pop(){
        Node node;
        if(head == null) {
            System.out.println("This Stack is empty");
            return -1;
        } else if(size == 1) {
            node = head;
            head = null;
        } else {
            node = head;
            head = node.next;
        }
        return node.value;
    }

    public int peek(){
        Node node;
        if(head == null) {
            System.out.println("This Stack is empty");
            return -1;
        } else {
            node = head;
        }
        return node.value;
    }

    public void delete(){
        head = null;
    }

    public boolean isEmpty(){
        return head == null;
    }
}
