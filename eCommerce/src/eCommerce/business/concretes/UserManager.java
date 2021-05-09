package eCommerce.business.concretes;

import eCommerce.business.abstracts.UserService;
import eCommerce.core.abstracts.CheckService;
import eCommerce.core.abstracts.EmailService;
import eCommerce.core.concretes.EmailValidator;
import eCommerce.entities.concretes.User;

public class UserManager implements UserService {

	private CheckService check;
	private EmailValidator emailCheck;
	
	
	

	public UserManager(CheckService check, EmailValidator emailCheck) {
		this.check = check;
		this.emailCheck = emailCheck;
	}

	@Override
	public void singUp(User user) {
		
		check.firstName(user);
		check.lastName(user);
		check.password(user);
		emailCheck.dogrulayıcı(user);
		
		
	}


}
