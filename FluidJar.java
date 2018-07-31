public class FluidJar extends Jar{

  private int timesAccesed;


  public FluidJar (String name, double value, double cap){

    super(name, value, cap);
      this.timesAccesed = 0;
  }

  public void withdraw (double amt){
    super.withdraw(amt);
    this.timesAccesed++;

  }

  public double deposit(double amt){
    super.deposit(amt);
    this.timesAccesed++;

    return amt;

  }



}
