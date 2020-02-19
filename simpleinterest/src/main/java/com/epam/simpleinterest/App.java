package com.epam.simpleinterest;
import java.io.*;
import java.util.*;
import java.lang.Math; 
/**
 * Hello world!
 *
 */

class Interest
{
	void simpleinterest(int principalamount,int interest,int timeperiod) {
		double simpleinterest1;
		simpleinterest1 = (principalamount*interest*timeperiod)/100;
		System.out.println("simple interest for above values is"+simpleinterest1);
		
		
	}
	void compoundinterest(int principalamount,int interest,int timeperiod,int numberoftimes) {
	double compoundinterest1;
	compoundinterest1=principalamount * Math.pow((1+interest/(numberoftimes*100)),(numberoftimes*timeperiod));
	
	System.out.println("compound interest for above values is"+compoundinterest1);
	}
}

public class App 
{
    public static void main( String[] args )
    {
    	int principalamount;
    	int interest,timeperiod,numberoftimes;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter values for principal amount and interest and time period");
    	principalamount=sc.nextInt();
    	interest=sc.nextInt();
    	timeperiod=sc.nextInt();
        Interest simpleinterest1=new Interest();
        Interest compoundinterest1=new Interest();
        simpleinterest1.simpleinterest(principalamount,interest,timeperiod);
        System.out.println("enter values for number of times interest");
        numberoftimes=sc.nextInt();
        compoundinterest1.compoundinterest(principalamount,interest,timeperiod,numberoftimes);
    }
}
