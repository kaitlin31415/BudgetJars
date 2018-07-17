import java.io.*;
import java.util.*;
import java.util.Calendar;

public class Runner{

  public static void main(String[] args){
	ArrayList<Jar> listOfJars = new ArrayList<Jar>();
    Scanner kb = new Scanner(System.in);
	System.out.println("To Create a jar hit enter, otherwise type 'view' to see your current setup");
	String input = kb.next();
	if (input.equals("")){
		System.out.println("What kind of jar would you like to create? A budget jar or savings jar? (Type b or s)");
		String nextInput = kb.next();
		if (nextInput.equals("b")){
			
			System.out.println("What would you like to call this jar?");
			String name= kb.nextLine();
			
			System.out.println("What is the maximum amount for this jar? i.e. what is the budget?");
			double cap = kb.nextDouble();
			
			System.out.println("What amount of money would you like to put in the jar?");
			double val = kb.nextDouble();
			
			System.out.println("Enter the category");
			String cat = kb.next();
			
			BudgetJar b = new BudgetJar(name, val, cap, cat );
			listOfJars.add(b);
			
			
		}
		
	}else{
		System.out.println(listOfJars);
		
	}

  }

}
