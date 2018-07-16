import java.util.*;


public class Jar{
  private String name;
  private double value;
  private double cap;

  public Jar(){
    this.name  = "default";
    this.value = 0.0;
    this.cap = 1000000;

  }
  public Jar (String name, double value, double cap){
    this.name = name;
    setValue(value);
    setCap(cap);

  }

  public Jar (String name, double value){
    this.name = name;
    setValue(value);
    this.cap = 1000000;

  }
  public Jar (String name){
    this.name = name;
    this.value = 0;
    this.cap = 1000000;

  }

  public Jar(Jar j){
    this.name = j.getName();
    setValue(j.getValue());
    setCap(j.getCap());

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




}
