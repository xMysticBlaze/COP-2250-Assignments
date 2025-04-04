package Wassid10;
public class Fastfood {
	private String restuarantName;
	private String foodName;
	private double price;
	private int quanity;

	public Fastfood() {
	}

	public Fastfood(String restuarantName, String foodName, double price, int quanity) {
		this.restuarantName = restuarantName;
		this.foodName = foodName;
		this.price = price;
		this.quanity = quanity;
	}

	public String getRestuarantName() {
		return restuarantName;
	}

	public void setRestuarantName(String restuarantName) {
		this.restuarantName = restuarantName;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuanity() {
		return quanity;
	}

	public void setQuanity(int quanity) {
		this.quanity = quanity;
	}
	@Override
	public String toString() {
		return "Fastfood [restuarantName=" + restuarantName + ", foodName=" + foodName + ", price=" + price
				+ ", quanity=" + quanity + "]";
	}
	
}