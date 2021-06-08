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
@Table(name="verification_codes")
public class VerificationCodes extends User {


	@Column(name="code")
      private String code;
	
	@Column(name="is_verified")
      private boolean isVerified;
}
