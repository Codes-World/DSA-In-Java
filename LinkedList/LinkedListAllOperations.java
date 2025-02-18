import java.util.*;
import java.io.*;

public class LinkedListAllOperations{
	Node head;
	
	class Node{
		int data;
		Node nextRef;
		
		//Construtor for insitializing the instance variable
		Node(int data){
			this.data = data;
			nextRef = null;
		}
	}

	//insert the node at the very end in the LinkedList
	public void insertAtEnd(int data){
		//intialize the newNode with the new data entered by the user.
		Node newNode = new Node(data);

		//LinkedList is empty?
		if(head == null){
			head = new Node(data);
			return;
		}

		//If linkedlist is not empty then traverse the linkedlist at the end of the node
		Node temp = head;
		while(temp.nextRef != null){
			temp = temp.nextRef;
		}
		temp.nextRef = newNode;
		return;
		
	}

	//insert the node at the very beginning in the LinkedList
	public void insertAtBeginning(int data){
		//intialize the newNode with the new data entered by the user.
		Node newNode = new Node(data);

		//LinkedList is empty?
		if(head == null){
			head = new Node(data);
			return;
		}

		//If linkedlist is not empty then traverse the linkedlist at the end of the node
		newNode.nextRef = head;
		head = newNode;
		
	}

	//insert a node after any node in the LinkedList
	public void insertAtSpecificPosition(int index, int data){

		//LinkedList is empty?
		if(head == null){
			head = new Node(data);
			return;
		}
		
		if(index < 1){
			System.out.println("Invalid Position");
		}
		else{
			Node newNode = new Node(data);
		
			Node temp = head;
			int i = 0;
			while(temp.nextRef != null && i != index-1){
				temp = temp.nextRef;
				i++;
			}
			newNode.nextRef = temp.nextRef;
			temp.nextRef = newNode;
		}
		return;
	}

	//Display all the node after the insertion
	public void printNodes(){
		Node current = head;
		while(current != null){
			System.out.print(current.data+"->");
			current = current.nextRef;
		}
		System.out.println();
	}

	public static void main(String[] args){
		LinkedListExa list = new LinkedListExa();
		Scanner sc = new Scanner(System.in);
		int exit = 1;
		do{
			System.out.println("\n***************Main Menu :: Choose any one of these option*************");
			System.out.print("\n1.Insert Node \n2.Delete Node \n3.Search Node \n4.Display Node \n5.Exit\n");
			
			System.out.print("\n\tEnter your choice :: ");
			int choice = sc.nextInt();
			
			switch(choice){
				case 1:
					System.out.println("\n\t*********Choose any one of these option*************");
					System.out.print("\n\t1.Insert Node at very end \n\t2.Insert Node at very beginning \n\t3.Insert after a node \n\t4.Main Menu");

					System.out.print("\n\tEnter your choice :: ");
					int choice1 = sc.nextInt();
					int data = 0;
					switch(choice1){
						case 1:
							System.out.print("\n\t************Insert node at very end************\n");
							System.out.print("\t\nEnter a data of integer type:: ");
							data = sc.nextInt();
						
							list.insertAtEnd(data);
							break;
						case 2:
							System.out.print("\n\t*******Insert node at very beginning**********\n");
							System.out.print("\t\nEnter a data of integer type:: ");
							data = sc.nextInt();
						
							list.insertAtBeginning(data);
							break;
						case 3:
							System.out.print("\n\t*******Insert node after a node**********\n");
							System.out.print("\t\nEnter a data of integer type:: ");
							data = sc.nextInt();
						
							list.insertAtSpecificPosition(2, data);
							break;
						case 4:
							break;
						default:
							System.out.println("Choice is invalid! Please try another choice....");
							break;
					}
				case 4:
					System.out.println("******LinkedList node******");
					list.printNodes();
					break;
				default:
					exit = 0;
					break;
					
			}
		}while(exit == 1);
	}
}