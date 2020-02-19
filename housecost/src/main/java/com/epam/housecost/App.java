package com.epam.housecost;
import java.util.*;


class Totalcost
{
	void calculatecost(int choice,int area) {
		int cost = 0;
		switch(choice) {
		case 1:cost=12000;
				break;
		case 2:cost=15000;
				break;
		case 3:cost=18000;
				break;
		case 4:cost=25000;
				break;
		
		}
		System.out.println("total cost for building house is"+(cost*area));
	}

}

public class App 
{
    public static void main( String[] args )
    {
    	int choice,area;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter type of house 1)standard material 2)above standard 3)high standard 4)fully automated");
    	choice=sc.nextInt();
    	System.out.println("enter the total area");
    	area=sc.nextInt();
    	Totalcost ob=new Totalcost();
    	ob.calculatecost(choice,area);
    	
    }
}
