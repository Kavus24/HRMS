package eCommerce.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerce.core.abstracts.EmailService;
import eCommerce.entities.abstracts.Entity;
import eCommerce.entities.concretes.User;

public class EmailValidator implements EmailService {

	public void dogrulayıcı(User user) {

		String emailPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";

		Pattern pattern = Pattern.compile(emailPattern);

		Matcher matcher = pattern.matcher(user.getEmail());

		boolean matchFound = matcher.find();

		if (matchFound) {
			
			System.out.println("Email doğru girildi");
			
		} else {
			System.out.println("Email yanlış girildi");

		}
	}

}
