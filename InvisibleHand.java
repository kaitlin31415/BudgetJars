import java.util.ArrayList;

public class InvisibleHand{

  private ArrayList <FluidJar> fluidJars;
  private ArrayList <BudgetJar> budgetJars;
  private ArrayList <SavingsJar> savingsJars;
  private ArrayList <ArrayList<Jar>> allTheJars = new ArrayList<ArrayList<Jar>>();
  private String clientName;


  public InvisibleHand(){
    fluidJars = new ArrayList<FluidJar>();
    budgetJars = new ArrayList<BudgetJar>();
    savingsJars = new ArrayList<SavingsJar>();
    allTheJars.add(fluidJars);
    allTheJars.add(budgetJars);
    allTheJars.add(SavingsJar);
    this.clientName = "";

  }

  public InvisibleHand (String name){
    fluidJars = new ArrayList<FluidJar>();
    budgetJars = new ArrayList<BudgetJar>();
    savingsJars = new ArrayList<SavingsJar>();
    allTheJars.add(fluidJars);
    allTheJars.add(budgetJars);
    allTheJars.add(SavingsJar);
    this.clientName = name;

  }

  public void addFluidJar(FluidJar j){
    this.fluidJars.add(j);

  }

  public void addBudgetJar(BudgetJar j){
    this.budgetJars.add(j);

  }

  public void addSavingsJar(SavingsJar j){
    this.savingsJars.add(j);

  }

  //Methods to Implement
  // - deleting Jars  (Moving the money around when a jar has been deleted)
  // - transfer money between jars



}
