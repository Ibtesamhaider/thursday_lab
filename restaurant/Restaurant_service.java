package restaurant;

public class Restaurant_service {
	public static void main(String[] args) {
		// object for ResturantMain Class
		Restaurant_main restaurantMain = new Restaurant_main();
		//Array for Create menu Method
		restaurantMain.CreateMenu();
		//Menu print Method
		Restaurant_main.getDisplay();
		//Menu order Method
		Restaurant_main.getOrder();
		//Menu for order and billing Method
		Restaurant_main.getBilling();
}
	}
