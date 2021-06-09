package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.JobSeekers;

public interface JobSeekersDao extends JpaRepository<JobSeekers, Integer> {

	List<JobSeekers> findByEmail(String email);
	List<JobSeekers> findByNationalityId(String nationalityId);
	List<JobSeekers> findById(int id);

}
