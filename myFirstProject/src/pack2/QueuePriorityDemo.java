package pack2;

import java.util.Arrays;
import java.util.PriorityQueue;

public class QueuePriorityDemo {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> num= new PriorityQueue<Integer>();
		num.addAll(Arrays.asList(12,34,56,87,45,34,23,98,34,27));
		System.out.println("Elements in the queue are  "+num);
		//num.remove();
		num.remove(27);
		System.out.println("after deletion the queue looks like this "+num);
		num.add(77);// Adds an element in the Queue.
		System.out.println(" after insertion the queue looks like this "+num);
		Integer i = 34;// to remove all the occurances of that object value.
		while(num.remove(i)) {}
		System.out.println(" after removing all occurances of 34 "+num);
		System.out.println("finds the size of the queue "+num.size());// Finds the size of the Queue.
		System.out.println(num.getClass());// gets the name of the parent class where PriorityQueue is stored.
		if (num.isEmpty()) {//returns true if queue is empty.
			System.out.println("the priority queue is empty");
		}else
			System.out.println("the priority queue is not empty");
		
		num.clear();// Empties the Queue.
			
		System.out.println("the queue is all empty or cleared "+num);
		
	}

}

