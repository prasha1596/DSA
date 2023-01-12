package singlyLinkedList;

/*Singly link list best suited for add remove operations from front of array. 
Otherwise the TC will O(n) for searching operations.
Linked list grows without having to resize, unlike arrays.*/

public class EmployeeLinkedList {

	private EmployeeNode head; 
	private int size;

	//1. Insert operation T.C.= O(1)
	public void addToFront(Employee employee) {		
		EmployeeNode node= new EmployeeNode(employee);
		node.setNext(head);
		head=node;	
		size++;
	}
	
	//2. Print list method
	public void printEmployeeList() {
		EmployeeNode current=head;
		System.out.print("Head -> ");
		
		while(current !=null) {
			System.out.print(current);
			System.out.print(" -> ");			
			current=current.getNext();
		}
		System.out.println("null");
	}
	
	//3. No of elements in LL.
	public int getSize() {
		return size;
	}
	
	//4. Check if list is empty?
	public boolean isEmpty() {
		return (head==null);
	}
	
	//5. Remove element from front
	public EmployeeNode removeNode() {
		if(isEmpty()) {
			return null;
		}
		EmployeeNode removeNode=head;
		head=head.getNext();
		size--;
		return removeNode;
	}
}
