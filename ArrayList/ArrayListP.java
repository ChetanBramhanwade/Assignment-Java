
/*
1.) Write a java program to do following operations on Array List(Integer)
a)	Add element
b)	Remove a particular element
c)	Modify
d)	View All elements(Use Iterator)
e)	View a Particular element (get() )
f)	Sort (Collections.sort) */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListP {
	public static void main(String[] args) {

		ArrayList<Integer> alist = new ArrayList<>();

		alist.add(10);
		alist.add(20);
		alist.add(30);
		alist.add(40);
		alist.add(50);
		alist.add(60);

//		for (Integer n : alist) {
//			System.out.println(n);
//		}

		System.out.println("iterate using iterator");

		Iterator it = alist.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		Scanner in = new Scanner(System.in);
		System.out.println("Enetr the index no to remove : ");
		int arr = in.nextInt();

		alist.remove(arr);
		{
			System.out.println("After Remove");
			System.out.println(alist);
		}

		System.out.println("Enter the index no and value for modify : ");
		int arrn = in.nextInt();
		int value = in.nextInt();
		alist.set(arrn, value);
		{
			System.out.println("After Modify");
			System.out.println(alist);
		}

		Collections.sort(alist);
		System.out.println("After Sorting");
		System.out.println(alist);

		System.out.println("Enter the get index");
		arr = in.nextInt();
		alist.get(arr);
		System.out.println(alist.get(arr));

	}

}
