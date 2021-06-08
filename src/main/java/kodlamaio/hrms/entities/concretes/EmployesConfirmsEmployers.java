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
@Table(name="employee_confirms_employers")
public class EmployesConfirmsEmployers extends User {

	
	@Column(name="employers_id")
      private int employersId;
}
