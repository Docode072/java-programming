package Collections;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;       
    }

}

public class LinkedListClass {
        protected void printList(Node head){
            if(head == null){
                System.out.println("List is empty");
                return;
            }
            while(head != null){
                System.out.print(head.data + " -> ");
                head = head.next;
            }
            System.out.println("null");
            
        }
        private Node insertAtBeginning(Node head, int data){
            Node temp = new Node(data);
            temp.next  = head;
            head = temp;
            temp = null;
            return head;
        }
        protected Node insertAtEnd(Node head, int data){
            if(head == null){
                head = new Node(data);
                return head;
            }
            Node curr = head;
            while(curr.next != null){
                curr = curr.next;

            }
            curr.next = new Node(data);
            curr = null;
            return head;
        }

        protected Node insertAtPos(Node head, int data, int pos){
            if(pos == 0){
                return insertAtBeginning(head, data);
            }
            Node curr = head;
            for(int i = 0; i < pos -1 && curr != null; i++){
                curr = curr.next;
            }
            if(curr == null){
                System.out.println("Position out of bounds for index: " + pos);
                return head;
            }
            Node temp = new Node(data);
            temp.next = curr.next;
            curr.next = temp;
            temp = null;
            curr = null;
            return head;
        }

        protected Node reverseList(Node head){
            if(head == null || head.next == null){
                return head;
            }
            Node prev = null;
            Node curr = head;
            Node temp  = curr;
            while(curr != null){
               temp = temp.next;
               curr.next = prev;
                prev = curr;
                curr = temp;

            }
            head = prev;
            return head;
        }

        protected Node deleteAtPos(Node head, int pos){
            if(head == null){
                System.out.println("List is empty");
                return head;
            }
            if(pos == 0){
                Node temp = head;
                head = head.next;
                temp = null;
                return head;
            }
            Node curr = head;
            for(int i = 0; i < pos -1 && curr != null; i++){
                curr = curr.next;
            }
            if(curr == null || curr.next == null){
                System.out.println("Position out of bounds for index: " + pos);
                return head;
            }
            curr.next = curr.next.next;
            curr = null;
            return head;
        }       

        public static void main(String[] args) {

            Node head = new Node(10);
            head.next = new Node(20);
            head.next.next = new Node(30);
            LinkedListClass list = new LinkedListClass();
            list.printList(head);
            head = list.insertAtBeginning(head,0);
            list.printList(head);
            head = list.insertAtEnd(head,40);
            list.printList(head);
            head = list.insertAtPos(head,25,3);
            list.printList(head);
            head = list.insertAtPos(head,50,10); // position out of bounds
            list.printList(head);
            head = list.reverseList(head);
            list.printList(head);
            list.deleteAtPos(head,3);
            list.printList(head);



        }
}
