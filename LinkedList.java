// Java program for reversing the Linked list
 
class LinkedList {
 
    static Node head;
	static Node reversehead;
 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d) {
            data = d;
            next = null;
        }
    }
 
    // A simple and tail recursive function to reverse
    // a linked list.  prev is passed as NULL initially.
    Node reverseUtil(Node head) {
			Node n;
			if(head.next == null){
				reversehead = head;
				return head;
			}
			else {
				n = reverseUtil(head.next);
				head.next = null;
				n.next = head;
				return head;
			}
    }
 
    // prints content of double linked list
    void printList(Node node) {
//		System.out.println("inside printlist" + node.data);
        while (node != null) {
            System.out.print( node.data + " ");
            node = node.next;
        }
    }
 
	int findLength(Node head) {
		if(head.next == null) {
			return 1;
		}
		else {
			return findLength(head.next) +1;
		}
	}
	int loopExist(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast.next != null) {
			if(fast.next.next != null) {
				slow = slow.next;
				fast = fast.next.next;
				if(slow == fast) {
					return 1;
				}
			}
			else {
				fast = fast.next;
			}
		}
		return 0;
	}
	
	int whereLoopStarts(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast.next != null) {
			if(fast.next.next != null) {
				slow = slow.next;
				fast = fast.next.next;
				if(slow == fast) {
					fast = head;
					while(slow != fast) {
						slow = slow.next;
						fast = fast.next;
					}
					return slow.data;
				}
			}
			else {
				fast = fast.next;
			}
		}
		return 0;		
	}
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(2);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);
        list.head.next.next.next.next.next = new Node(6);
        list.head.next.next.next.next.next.next = new Node(7);
        list.head.next.next.next.next.next.next.next = new Node(8);
 
        System.out.println("Original Linked list is :");
        list.printList(head);
        Node res = list.reverseUtil(head);
        System.out.println("");
        System.out.println("");
        System.out.println("Reversed linked list : ");
        list.printList(reversehead);
		System.out.print("Length of linked list: ");
		System.out.println(list.findLength(head));
//		list.head.next.next.next.next.next.next.next.next = list.head.next.next.next.next.next.next.next;
//		System.out.println("Is there loop in linked list? "+list.loopExist(head));
//		System.out.println("Check where loop starts? "+ list.whereLoopStarts(head));
		//System.out.println("Find Intersection of two linked list?" + list.findIntersectionPoint(head, head1));
    }
}
 