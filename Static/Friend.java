package Static;

public class Friend {

	  String name;
	  static int numOfFriends;
	  
	  Friend(String name){
		  this.name = name;
		  numOfFriends++;
	  }
	  
	  static void displayNoOfFriends() {
		  
		  System.out.println("You Have "+numOfFriends+" Friends");
		  
	  }
}
