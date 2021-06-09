package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.base.Objects;

import kodlamaio.hrms.business.abstracts.EmployersService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployersDao;
import kodlamaio.hrms.entities.concretes.Employers;

@Service
public class EmployersManager implements EmployersService {

	private EmployersDao employersDao;
	
	@Autowired
	public EmployersManager(EmployersDao employersDao) {
		super();
		this.employersDao = employersDao;
	}

	@Override
	public DataResult<List<Employers>> getAll() {
		return new SuccessDataResult<List<Employers>>(this.employersDao.findAll());
	}
	@Override
	public DataResult<List<Employers>> getByEmail(String email) {
		return new SuccessDataResult<List<Employers>>(this.employersDao.findByEmail(email));
	}

	@Override
	public Result add(Employers employers) {
		if(getByEmail(employers.getEmail()).getData()!=null){
			return new ErrorResult("This email address already exists.");
		}
//		if(!this.validationForEmployer(employers)) {
//			return new ErrorResult("You have entered incomplete information. Please check your information again.");
//		}
		this.employersDao.save(employers);
		return new SuccessResult("Employers added successfully.");
	}

//	private boolean validationForEmployer(Employers employers) {
//		if (Objects.isNull(employers.getCompanyName()) || Objects.isNull(employers.getWebAddress()) || Objects.isNull(employers.getEmail()) 
//				|| Objects.isNull(employers.getPhoneNumber()) || Objects.isNull(employers.getPassword())){
//			return false;
//		}
	}

