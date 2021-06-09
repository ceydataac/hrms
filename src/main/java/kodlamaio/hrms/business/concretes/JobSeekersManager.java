package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobSeekersService;
import kodlamaio.hrms.core.adapter.abstracts.UserCheckService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekersDao;
import kodlamaio.hrms.entities.concretes.Employers;
import kodlamaio.hrms.entities.concretes.JobSeekers;

@Service
public class JobSeekersManager implements JobSeekersService {

	private UserCheckService userCheckService;
	private JobSeekersDao jobSeekersDao;
	
	@Autowired
	public JobSeekersManager(UserCheckService userCheckService,JobSeekersDao jobSeekersDao) {
		super();
		this.userCheckService = userCheckService;
		this.jobSeekersDao = jobSeekersDao;
	}
	@Override
	public DataResult<List<JobSeekers>> getAll() {

		return new SuccessDataResult<List<JobSeekers>>(this.jobSeekersDao.findAll());
	}

	@Override
	public Result add(JobSeekers jobSeekers) {
		if(!userCheckService.checkIfRealPerson(jobSeekers)){
			return new ErrorResult("Not a valid person");
	     	}
			else
			//if(!validationForCandidate(jobSeekers)) {
			//	return new ErrorResult("You have entered incomplete information. Please check your information again.");
			//}
			if(getByEmail(jobSeekers.getEmail()).getData()!=null){
				return new ErrorResult("This email address already exists.");
			}
			this.jobSeekersDao.save(jobSeekers);
			return new SuccessResult("Candidate successfully added.");
	}

	@Override
	public DataResult<List<JobSeekers>> getByEmail(String email) {
		return new SuccessDataResult<List<JobSeekers>>(this.jobSeekersDao.findByEmail(email));
	}

	@Override
	public DataResult<List<JobSeekers>> getByNationalityId(String nationalityId) {
		return new SuccessDataResult<List<JobSeekers>>(this.jobSeekersDao.findByNationalityId(nationalityId));
	}

	@Override
	public DataResult<List<JobSeekers>> getById(int id) {
		return new SuccessDataResult<List<JobSeekers>>(this.jobSeekersDao.findById(id));
	}

}
