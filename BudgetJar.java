public class BudgetJar extends Jar{

  private boolean depositable;
  private boolean withdrawable;
  private String category; 

  public BudgetJar (String name, double value, double cap){
    super(name, value, cap );
    this.depositable = false;
    this.withdrawable = false;


  }
  public BudgetJar (String name, double value, double cap, String category){
    super(name, value, cap );
    this.depositable = false;
    this.withdrawable = false;
	setCategory(category);


  }

  public boolean canDeposit(){
    return this.depositable;

  }
  public boolean canWithdraw(){
    return this.withdrawable;

  }
  
  private void setCategory(String c){
	  if (c.equalsIgnoreCase("weekly") || c.equalsIgnoreCase("monthly")){
		  this.category = c.toLowerCase(); 
		  
	  } else{
		  System.out.println("Category not yet supported. Category has been set to VOID");
		  this.category = "VOID";
	  }
	  
  }
  public String getCategory(){
	  return this.category;
  }
  
  public String toString(){
	return super.toString() + " Category: " + this.category; 
  }

}
