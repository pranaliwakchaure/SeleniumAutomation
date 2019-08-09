package Functions;

public class Car 
{
  static int wheels=4;
  String colour="White";
  String model="VDI";
  
  public void braking()
  {
	  System.out.println(colour +" "+ model +" is having "+ wheels +"  wheels");
  }
  
  //default constructer
  public Car()
  {
	  
  }
  //Parameterized constructor
  public Car(String colour1,String model1)
  {
	  colour=colour1;
	  model=model1;
  }
}
