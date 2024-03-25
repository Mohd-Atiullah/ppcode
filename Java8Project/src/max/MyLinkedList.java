package max;

public class MyLinkedList {

	Node head;
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			
			this.data = data;
			this.next = null;
		}
	}
		public static MyLinkedList insert(MyLinkedList list,int data) {
			Node newNode=new Node(data);
			if(list.head==null) {
			list.head=newNode;	
			}else {
				Node last=list.head;
				while(last.next!=null) {
					last=last.next;
				}
				last.next=newNode;
			}
			return list;
		}
		
		public static void printList(MyLinkedList list) {
			Node currentNode=list.head;
			
			System.out.println("Listlinkedlist");
			while(currentNode!=null) {
				System.out.println(currentNode.data);
				currentNode=currentNode.next;
			}
		}
	
}

