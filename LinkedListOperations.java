import java.io.*;
import java.util.*;
public class LinkedListOperations {
	
	//Node class 
	static public class Node {
		int data;
		Node next = null;
		Node(int d) {
			data = d;
		}
	}
	
	public static Node insertAtEnd(Node head, int d) {
		Node tempnode = new Node(d);
		tempnode.next = null;
		if(head == null) {
			System.out.println("List is empty");
			return null;
		}
		Node curr = head;
		while(curr.next != null) 
			curr = curr.next;
		curr.next = tempnode;
		return tempnode;
	}
	
	public static void printList(Node head) {
		System.out.println("Linked List is: ");
		while(head != null) {
			System.out.println(head.data + "\t");
			head = head.next;
		}
	}
	
	public static void nthNodeFromEnd(Node head, int n) {
		Node s = head;
		Node f = head;
		while(n > 1) {
			f = f.next;
			n--;
		}
		while(f.next != null) {
			f = f.next;
			s = s.next;
		}
		System.out.println(s.data);
	}
	
	public static int isThereLoop(Node head) {
		Node f = head;
		Node s = head;
		while(s != null && f.next != null) {
			f = f.next;
			if(f == s) {
				return 1;
			}
			if(f.next == null) {
				return 0;
			}
			f = f.next;
			if(f == s) {
				return 1;
			}
			s = s.next;
		}
		return 0;
	}
	
	public static void main(String Args[]) {
		Node head = new Node(1);
		insertAtEnd(head, 2);
		Node h = insertAtEnd(head, 3);
		insertAtEnd(head, 4);
		Node t = insertAtEnd(head, 5);
		head.next = head;
		//printList(head);
		//nthNodeFromEnd(head, 5);
		int x = isThereLoop(head);
		System.out.println(x);
	}
}