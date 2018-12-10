package validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validations {
	
	public boolean nameValidation(String name) {
		Pattern p=Pattern.compile("[A-Z][a-z]{3,10}");
		Matcher m=p.matcher(name);
	//	System.out.println(m.matches());
		return true;
	}
	
	public boolean emailValidation(String email) {
		Pattern p2=Pattern.compile("[a-z0-9._+]+@[a-z]+.[a-z]{2,3}");
		Matcher m2=p2.matcher(email);
		//System.out.println(m2.matches());
		return true;
	}
		

}
