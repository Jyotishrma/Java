package innerclasses;

public class Star {
	private String location;
	private String cap;
	
	class Coffee {
		 private String name;
		 private String price;	
		 
		 public Coffee() {
			// TODO Auto-generated constructor stub
		}
		 
		 
		 
		 public Coffee(String name, String price) {
			super();
			this.name = name;
			this.price = price;
		}



		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public String getPrice() {
			return price;
		}



		public void setPrice(String price) {
			this.price = price;
		}



		void printC () {
			 
			 System.out.println("Coffee name  " + name);
			 System.out.println("Coffee Price  " + price);
		 				}
					}

	public Star(String location, String cap) {
		super();
		this.location = location;
		this.cap = cap;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}

	void printS(){
		 System.out.println("Star name  " + location);
		 System.out.println("Star Capacity  " + cap);
		 
		
	}
}
