import java.io.*;
import java.util.*;
import java.util.Calendar;

public class Runner{

  public static void main(String[] args){
	ArrayList<Jar> listOfJars = new ArrayList<Jar>();
    Scanner kb = new Scanner(System.in);
	System.out.println("To Create a jar enter 1, otherwise type 'view' to see your current setup");
	int input = kb.nextInt();
	if (input==1){
		System.out.println("What kind of jar would you like to create? A budget jar or savings jar? (Type 1 or 0)");
		int nextInput = kb.nextInt();
		if (nextInput ==1 ){
			
			System.out.println("What would you like to call this jar?");
			String name= kb.next();
			
			System.out.println("What is the maximum amount for this jar? i.e. what is the budget?");
			double cap = kb.nextDouble();
			
			System.out.println("What amount of money would you like to put in the jar?");
			double val = kb.nextDouble();
			
			System.out.println("Enter the category");
			String cat = kb.next();
			
			BudgetJar b = new BudgetJar(name, val, cap, cat );
			listOfJars.add(b);
			
			
		}
		System.out.println(listOfJars);
		
	}else{
		System.out.println(listOfJars);
		
	}

  }

}
