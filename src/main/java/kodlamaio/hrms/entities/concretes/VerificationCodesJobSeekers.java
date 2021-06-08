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
@Table(name="verification_codes_job_seekers")

public class VerificationCodesJobSeekers extends User {

	@Column(name="job_seekers_id")
      private int jobSeekersId;
}
