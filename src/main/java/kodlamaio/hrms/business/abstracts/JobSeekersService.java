package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeekers;

public interface JobSeekersService {

	
	Result add(JobSeekers jobSeeker);
	
	DataResult<List<JobSeekers>> getAll();
	DataResult<List<JobSeekers>> getByEmail(String email);
	DataResult<List<JobSeekers>> getByNationalityId(String nationalityId);
	DataResult<List<JobSeekers>> getById(int id);
	
}
