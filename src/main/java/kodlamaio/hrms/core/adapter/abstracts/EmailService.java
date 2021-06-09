package kodlamaio.hrms.core.adapter.abstracts;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.entities.concretes.User;
@Service
public interface EmailService {

	boolean verify(User user) ;
	
	void sendMail(String email,String message);
}
