package Encapsulation;

public class Car {
	
	  private String name;
	  private String model;
	  private int year;
	  
	  Car(String name,String model,int year){
		  
		  this.setName(name);
		  this.setModel(model);
		  this.setYear(year);
		  
	  }
	  
	  // Get method to retrieve values
	  public String getName() {
		  return name;
		}
	  
	  public String getModel() {
		  return model;
	  }

	  public int getYear() {
		  return year;
	  }
	  
	  
	  //Set method to change or set
	  public void setName(String name) {
		  this.name = name;
	  }
	  
	  public void setModel(String model) {
		  this.model = model;
	  }
	  
	  public void setYear(int year) {
		  this.year = year;
	  }
}