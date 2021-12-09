package com.package3;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorEx implements Comparator{
	

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		if(i1<i2)
			return +1;
		else if(i1>i2)
			return -1;
		
		else return 0;
	}
	public static void main(String[] args) {
	TreeSet tSet=new TreeSet<>(new ComparatorEx());
	tSet.add(20);
	
	}
	
	
	
	
	
	
	
	

}
