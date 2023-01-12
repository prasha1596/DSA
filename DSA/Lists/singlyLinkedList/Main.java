package singlyLinkedList;

public class Main {
	
	public static void main(String[] args) {
	Employee jane=new Employee(100,"Jane Jones");
	Employee mary=new Employee(200,"Mary smith");
	Employee wil=new Employee(300,"Wil Wheaton");
	Employee prachi=new Employee(400,"Prachi Sharma");
	
	EmployeeLinkedList eList = new EmployeeLinkedList();
	System.out.println(eList.isEmpty());

	eList.addToFront(jane);
	eList.addToFront(mary);
	eList.addToFront(wil);
	eList.addToFront(prachi);
	
	eList.printEmployeeList();
	System.out.println(eList.isEmpty());
	eList.getSize();
	
	eList.removeNode();
	System.out.println(eList.getSize());
	
	}
}
