package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="job_seekers")

public class JobSeekers extends User {
	

	@Column(name="first_name")
      private String firstName;
	
	@Column(name="last_name")
      private String lastName;
	
	@Column(name="nationality_id")
      private String nationalityId;
	
	@Column(name="date_of_birth")
      private String dateOfBirth;


}
