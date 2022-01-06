package bins;

public class customer {
	private String Cus_id;
	private String Cus_name;
	private String Cus_email;
	private String Cus_pass;
	private long Cus_num;
	public String getCus_id() {
		return Cus_id;
	}
	public void setCus_id(String cus_id) {
		Cus_id = cus_id;
	}
	public String getCus_name() {
		return Cus_name;
	}
	public void setCus_name(String cus_name) {
		Cus_name = cus_name;
	}
	public String getCus_email() {
		return Cus_email;
	}
	public void setCus_email(String cus_email) {
		Cus_email = cus_email;
	}
	public String getCus_pass() {
		return Cus_pass;
	}
	public void setCus_pass(String cus_pass) {
		Cus_pass = cus_pass;
	}
	public long getCus_num() {
		return Cus_num;
	}
	public void setCus_num(long cus_num) {
		Cus_num = cus_num;
	}
	@Override
	public String toString() {
		return "customer [Cus_id=" + Cus_id + ", Cus_name=" + Cus_name + ", Cus_email=" + Cus_email + ", Cus_pass="
				+ Cus_pass + ", Cus_num=" + Cus_num + "]";
	}
	
	
}
