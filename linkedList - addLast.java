public class A {
    public static class Node {
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public static class LinkedList {
        Node head;
        Node tail;
        int size;
        
        void addLast(int data) {
            Node nn = new Node(data);
            
            if(size == 0) {
                head = nn;
                tail = nn;
                size++;
            } else {
                tail.next = nn;
                tail = nn;
                size++;
            }
        }
    }
    
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        
        ll.addLast(50);
        ll.addLast(60);
        
        ll.printLL();
    }
}