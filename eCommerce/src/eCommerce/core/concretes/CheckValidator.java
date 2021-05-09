package eCommerce.core.concretes;

import java.util.regex.Pattern;

import eCommerce.core.abstracts.CheckService;
import eCommerce.entities.concretes.User;

public class CheckValidator implements CheckService {

	@Override
	public void password(User user) {
		
		boolean controllerPassword;
		
		if(user.getPassword().length() < 6) {
			System.out.println("Parolanız en az altı karakterden oluşmalıdır.");
			
			controllerPassword = false;
		}else {
			System.out.println("Parola doğru girildi.");
			
		}
		
	}

	@Override
	public void firstName(User user) {
		
		boolean controllerFirstName;
		
		if(user.getFirstName().length() < 2) {
			System.out.println("İsminiz en az 2 karakterden oluşmalıdır.");
			controllerFirstName = false;
		}else {
			System.out.println("İsim doğru girildi.");
		}
		
	}

	@Override
	public void lastName(User user) {
		
		boolean controllerLastName;
		
		if(user.getLastName().length() < 2) {
			System.out.println("Soyadınız en az 2 karakterden oluşmalıdır.");
			controllerLastName = false;
		}else {
			System.out.println("Soyad doğru girildi.");
		}
	}

	
}
