package kodlamaio.hrms.core.adapter.concretes;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.core.adapter.abstracts.EmailService;
import kodlamaio.hrms.entities.concretes.User;
@Service
public class EmailServiceAdapter implements EmailService {

	@Override
	public boolean verify(User user) {
		
		return true;
	}

	@Override
	public void sendMail(String email, String message) {
		
		System.out.println(email + " kullanıcısına" + message + "gönderildi.");
		
		
	}

}
