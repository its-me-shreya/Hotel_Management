package bins;

public class rooms {
	private String room_id;
	private String room_type;
	private String wifi;
	private String tv;
	private double price;
	private String xtra_fea;
	private String status;
	
	public void setRoom_id(String room_id) {
		this.room_id = room_id;
	}

	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}

	public void setWifi(String wifi) {
		this.wifi = wifi;
	}

	public void setTv(String tv) {
		this.tv = tv;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setXtra_fea(String xtra_fea) {
		this.xtra_fea = xtra_fea;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRoom_id() {
		return room_id;
	}
	public String getRoom_type() {
		return room_type;
	}
	public String getWifi() {
		return wifi;
	}
	public String getTv() {
		return tv;
	}
	public double getPrice() {
		return price;
	}
	public String getXtra_fea() {
		return xtra_fea;
	}
	public String getStatus() {
		return status;
	}
	@Override
	public String toString() {
		return "rooms [room_id=" + room_id + ", room_type=" + room_type + ", wifi=" + wifi + ", tv=" + tv + ", price="
				+ price + ", xtra_fea=" + xtra_fea + ", status=" + status + "]";
	}
	
	
}
