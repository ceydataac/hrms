package kodlamaio.hrms.core.adapter.abstracts;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.entities.concretes.JobSeekers;
@Service
public interface UserCheckService {

	boolean checkIfRealPerson(JobSeekers jobSeekers);
}
