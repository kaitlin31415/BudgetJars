public class BudgetJar extends Jar{

  private boolean depositable;
  private boolean withdrawable;

  public BudgetJar (String name, double value, double cap){
    super(name, value, cap );
    this.depositable = false;
    this.withdrawable = false;


  }

  public boolean canDeposit(){
    return this.depositable;

  }
  public boolean canWithdraw(){
    return this.withdrawable;

  }

}
