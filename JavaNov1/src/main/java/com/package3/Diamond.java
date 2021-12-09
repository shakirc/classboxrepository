package com.package3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Diamond {
	static void dmd(int beginNum, int endNum) {
		if(beginNum==0)beginNum = -2;
		if(beginNum<-endNum)
			return;
		System.out.print(Math.abs(beginNum));
		dmd(beginNum-1,endNum);
	}
	public static void main(String[] args) {
	//TODO Auto-generated method stub
		int pymd=4;
		for(int i=1;i<=pymd+1;i++) {
			for(int j=0;j<=pymd+1-i;j++) {
				System.out.println();
			}
			dmd(i,i);
			System.out.println();
		}
	
	
}
}
