package com.package3;
import java.util.ArrayDeque;
//Collections - Lists(ArrayList&LinkedList) - Vector&Stack, 
//Collections - Set(HashSet - LinkedHashSet & SortedSet - NavigableSet&TreeSet) -  eliminates duplicates
//Collections - Queue(PriorityQueue&BlockingQueue - PriorityBlockingQueue&LinkedBlockingQueue)

//Note that Collections and Map are two different interfaces

//Map(HashMap & IdentityHashMap & SortedMap & Dictionary/Hashtable/Properties) - 
//Map represents a group of objects as "key value", no duplicate keys;but values can be duplicated
//Hashtable is the underlying data structure,insertion order is not preserved, 
//TreeMap
//Comparator - public int compare(Object obj1, Object obj2);
		// - public boolean 
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Properties;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;


public class Collections  {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		//arraylist lists whatever is placed as the value
		ArrayList arr1=new ArrayList();
		arr1.add(10);
		arr1.add(20);
		arr1.add(100);
		arr1.add(365);
		arr1.add(45);
		arr1.add(97);
		//System.out.println(arr1.get(0));
		//System.out.println(arr1);
		LinkedList llist2 = new LinkedList(arr1);		
		
	
//Javabean - reusable component

/*	LinkedList<Object> llist= new LinkedList<>();
	
	
	
	InterEmployeeDAO empDAO=new EmployeeDAOEx();
	List<EmployeeEx> empList=empDAO.getEmployees();
	for(EmployeeEx employee : empList) {
		System.out.println(employee.getEmpID()+"\t"+employee.getName()+"\t"+employee.getSalary()+"/t"+employee.getDebtID());
	} 
	Stack<String> stack2=new Stack<String>();
	stack2.push("hello");
	stack2.addAll(stack2); //.addAll(collections)
	System.out.println(stack2);
	
	//cursors -- extracts the data from the collection, similar to for each (Enumeration(I),Iterator(I),ListIterator(I))
	//Enumeration can be applied only on top of Legacy classes
	Enumeration<String> enumeration=stack2.elements();
	while(enumeration.hasMoreElements()) {
		System.out.println(enumeration.nextElement());
	} 
	//Iterator - a universal cursor. can be applied on all types of collections
	//ListIterator- limited to the list family
	ListIterator llistIterator=llist.listIterator();
	while(llistIterator.hasNext()) {
		System.out.println(llistIterator.next());
	} */
/*	HashSet empSet=new HashSet<>();
	empSet.add(100);
	empSet.addAll(arr1);
	System.out.println(empSet);
	
	LinkedHashSet lhashSet= new LinkedHashSet<>(); //data randomized
	lhashSet.add(300);
	lhashSet.add(10);
	lhashSet.addAll(arr1);
	System.out.println("data from linked hash set" + lhashSet);
	
	TreeSet tSet= new TreeSet<>(); //data in sorting order 
	tSet.add(4567);
	tSet.add(987);
	tSet.add(97);
	tSet.add(56);
	tSet.add(9000);
	System.out.println(tSet.first());
	System.out.println(tSet);
	
	Queue queue1=new PriorityQueue<>(); //follows the queue data structure
	queue1.add(465);
	queue1.add(50);
	queue1.add(24);
	System.out.println(queue1);
	System.out.println(queue1.peek());
	
	Deque deque= new ArrayDeque<>();
	deque.addAll(arr1);
	System.out.println(deque); */
	
/*	HashMap map1=new HashMap<>();
	map1.put(101, "101value"); //.put(key,value of the key)
	map1.put(102, "102value");
	map1.put(103, "The value would be low");
	map1.put(104, "The value is high");
	System.out.println(map1);
	System.out.println(map1.get(104));
	Set keySet= map1.keySet(); //collects the keys 
	System.out.println(keySet);
	Collection map1values= map1.values(); //collects the key values
	System.out.println(map1.values()); 
		
/*	InterEmployeeDAO empDAO1=new EmployeeDAOEx();
	empDAO1.addEmployeesWithMap(101, new EmployeeEx(101, "101 Shakir", 1010, 28));
	int size = empDAO1.addEmployeesWithMap(102, new EmployeeEx(102, "102 Shomari", 1020, 26));
	System.out.println("the size is\t"+size);
	
	EmployeeEx employee = empDAO1.updateEmployeeSalaryWithMap(101, 101010);
	System.out.println(employee.getEmpID()+"\t"+employee.getSalary()+"\t"+employee.getDebtID()); */
	
/*	System.out.println(args[0]);
	System.out.println(args[1]);
	System.out.println("the sum is:"+Integer.parseInt(args[0])+Integer.parseInt(args[1])); */
	
/*	InterEmployeeDAO empDAO=new EmployeeDAOEx();
	Properties empData=empDAO.getEmployeesWithProperties();
	System.out.println(empData.getProperty("101"));
	System.out.println(empData); */
	
	//Arrays - Collections 
	System.out.println("Before" + arr1);
	//Collection.shuffle(arr1);
	

}

}






