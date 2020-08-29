package arrayLists;

import java.util.ArrayList;
import java.util.List;

public class MainProg {
	
	public static void main(String[] args) {
	List<Employee> myList = new ArrayList<>();
	
	myList.add(new Employee(100,"Prachi"));
	myList.add(new Employee(200,"Prakhar"));
	myList.add(new Employee(300,"Neeta"));
	myList.add(new Employee(400,"Rajnesh"));
	
	myList.forEach(emp -> System.out.println(emp.id+"  "+emp.name));//lambda expression
	System.out.println();
	System.out.println(myList.get(2));
	
	System.out.println();
	System.out.println(myList.isEmpty());
	
	System.out.println();
	myList.set(3, new Employee(500,"Papa"));
	myList.forEach(e -> System.out.println(e));
	
	System.out.println();
	System.out.println("The size of list is: "+myList.size());
	
	myList.add(3,new Employee(400,"Rajnesh"));
	
	Employee[] empArray = myList.toArray(new Employee[myList.size()]);
	for(Employee e: empArray) {
		System.out.println(e);
	}
	System.out.println();
	System.out.println(myList.contains(new Employee(100,"Prachi")));
	
	System.out.println();
	System.out.println(myList.indexOf(new Employee(100,"Prachi")));
	
	System.out.println();
	myList.remove(4);
	myList.forEach(e -> System.out.println(e.name));
	}
}
