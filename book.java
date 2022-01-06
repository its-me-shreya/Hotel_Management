package bins;

public class book {
	private String room_id;
	private String cus_id;
	private double price;
	private String checkout;
	public String getRoom_id() {
		return room_id;
	}
	public void setRoom_id(String room_id) {
		this.room_id = room_id;
	}
	public String getCus_id() {
		return cus_id;
	}
	public void setCus_id(String cus_id) {
		this.cus_id = cus_id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCheckout() {
		return checkout;
	}
	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}
	@Override
	public String toString() {
		return "book [room_id=" + room_id + ", cus_id=" + cus_id + ", price=" + price + ", checkout=" + checkout + "]";
	}
	
}
