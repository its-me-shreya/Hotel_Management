package Util;
import java.util.regex.*;    
public class EmailValid {
	public boolean validmail(String mail) {
		String Rmail="^[A-Za-z0-9+_.-]+@(.+)$";
		Pattern pattern = Pattern.compile(Rmail); 
		Matcher matcher = pattern.matcher(mail); 
		return matcher.matches();
	}
	public boolean validname(String name) {
		String Rname="[A-Za-z]+";
		Pattern pattern = Pattern.compile(Rname); 
		Matcher matcher = pattern.matcher(name); 
		return matcher.matches();
	}
}
