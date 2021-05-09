package eCommerce.core.abstracts;

import eCommerce.entities.concretes.User;

public interface CheckService {
	
	void password(User user);
	void firstName(User user);
	void lastName(User user);
	
}
