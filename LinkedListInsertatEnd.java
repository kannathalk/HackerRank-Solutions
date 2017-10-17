import java.io.*;
import java.util.*;


public class LinkedListInsertatEnd {
	static class Node {
		int data;
		Node next;
		Node(int d) {
			data = d;
			next = null;
		}
		
	}
	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
			System.out.println("Inside while and ele is" + ele);
            head = insert(head,ele);
			
		}
        display(head);
        sc.close();
    }
    public static  Node insert(Node head,int data) {
        //Complete this method
        
        Node n = new Node(data);
		if(head == null) {
			head = n;
			return head;
        }
        Node curr = head;
        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = n;
        return head;
    }
	
}