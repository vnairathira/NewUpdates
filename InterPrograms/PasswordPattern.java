package InterPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordPattern {
	//private static Pattern pattern=Pattern.compile("((?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%&]).{8,12})");
		//email
		private static Pattern pattern=Pattern.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
public static boolean validate(String pass) {
	Matcher match=pattern.matcher(pass);
	if(match.matches()) {
		return true;
	}
	return false;
}
public static void main(String[] args) {
	System.out.println(validate("adhi@2016"));
}
}
