import java.util.*;


public class Jar{
  private String name;
  private double value;
  private double cap;
  protected boolean depositable;
  protected boolean withdrawable;


  public Jar(){
    this.name  = "default";
    this.value = 0.0;
    this.cap = 1000000;
	this.depositable = false;
    this.withdrawable = false;

  }
  public Jar (String name, double value, double cap){
    this.name = name;
    setValue(value);
    setCap(cap);
	   this.depositable = false;
    this.withdrawable = false;
  }

  public Jar (String name, double value){
    this.name = name;
    setValue(value);
    this.cap = 1000000;
	this.depositable = false;
    this.withdrawable = false;
  }
  public Jar (String name){
    this.name = name;
    this.value = 0;
    this.cap = 1000000;
	this.depositable = false;
    this.withdrawable = false;
  }

  public Jar(Jar j){
    this.name = j.getName();
    setValue(j.getValue());
    setCap(j.getCap());
	this.depositable = false;
    this.withdrawable = false;
  }

  public String getName(){
    return this.name;

  }

  public double getValue(){
    return this.value;

  }
  public double getCap(){
    return this.cap;
  }



  public void setValue(double val){
    if (val >=0){
      this.value = val;

    }else{
      System.out.println("Negative Value Given, value has been set to 0.0");
      this.value = 0.0;

    }

  }
  public void setCap(double val){
    if (val >=0){
      this.cap = val;

    }else{
      System.out.println("Negative Cap Given, Cap has been set to 1000000");
      this.cap = 1000000;

    }

  }

  public String toString(){
	  return "Name: " + this.name + " Amount of Money: " + this.value + " Maximum Amount: " + this.cap;

  }
  public boolean canDeposit(){
    return this.depositable;

  }
  public boolean canWithdraw(){
    return this.withdrawable;

  }

  public void withdraw(double amt){
	  if (this.withdrawable){
		  if (this.value - amt >=0){
			  this.value -= amt;
		  } else{
			  System.out.println("Not enough money in jar.");

		  }
	  }else{
		System.out.println("Jar Cannot be withdrawn from");

	  }
  }

  public double deposit(double amt){
	if (this.depositable){
		double check = this.value + amt;
		if (this.value + amt > this.cap){
			this.value = this.cap;
			return check - this.cap;
		}else{
			this.value += amt;
			return 0;
		}
	}
  return 0;
  }






















}
