package eCommerce;

import eCommerce.business.concretes.UserManager;
import eCommerce.core.abstracts.CheckService;
import eCommerce.core.concretes.CheckValidator;
import eCommerce.core.concretes.EmailValidator;
import eCommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User abc = new User(1, "Okan", "Ok", "okanok@gmail.com", "123456");
		
		
		UserManager userManager = new UserManager(new CheckValidator(), new EmailValidator());
		userManager.singUp(abc);

		
	}

}
