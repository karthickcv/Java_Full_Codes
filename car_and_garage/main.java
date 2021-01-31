package car_and_garage;

public class main {

	public static void main(String[] args) {
		
		Car car1 = new Car("BMW");
		Car car2 = new Car("Mercedes");

		garage garage = new garage();
		
		garage.park(car1);
	}

}
