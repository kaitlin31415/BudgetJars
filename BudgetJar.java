public class BudgetJar extends Jar{

  
  private String category; 

  public BudgetJar (String name, double value, double cap){
    super(name, value, cap );



  }
  public BudgetJar (String name, double value, double cap, String category){
    super(name, value, cap );

	setCategory(category);


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
