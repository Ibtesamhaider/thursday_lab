package restaurant;
//class for Restaurant
public class Restaurant {
	//constructor for menu
		String menu;
		int id;
		public Restaurant(int id,String menu) {
			super();
			this.id = id;
			this.menu = menu;
		}
		//get method
		public String getMenu() {
			return menu;
		}
		public int getId() {
			return id;
		}
	}
	//class for price
	class Price {
		int price;
		public Price(int price) {
			//constructor for price
			super();
			this.price = price;
		}
		//get method for price
		public int getPrice() {
			return price;
		}
	}

