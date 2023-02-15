class Node {
    int data;
    Node next;

    Node(int data)
    {
        this.data=data;
        next = null;
    }
}
 
class MergeLinkedList {
    Node head;

    public void add(Node node)
    {
        if (head == null) {
            head = node;
        }
        else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }

    void printList()
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[])
    {
       
        MergeLinkedList llist1 = new MergeLinkedList();
       MergeLinkedList llist2 = new MergeLinkedList();
 
        llist1.add(new Node(6));
        llist1.add(new Node(100));
        llist1.add(new Node(51));
        llist2.add(new Node(28));
        llist2.add(new Node(33));
        llist2.add(new Node(65));
 
        llist1.head = new li().sortedMerge(llist1.head,
                                            llist2.head);
        System.out.println("Merged Linked List is:");
        llist1.printList();
    }
}
 
class li {

    Node sortedMerge(Node headA, Node headB)
    {
 
        Node dNode = new Node(0);

        Node tail = dNode;
        while (true) {
 
            if (headA == null) {
                tail.next = headB;
                break;
            }
            if (headB == null) {
                tail.next = headA;
                break;
            }
 
            if (headA.data <= headB.data) {
                tail.next = headA;
                headA = headA.next;
            }
            else {
                tail.next = headB;
                headB = headB.next;
            }
 
     
            tail = tail.next;
        }
        return dNode.next;
    }
}