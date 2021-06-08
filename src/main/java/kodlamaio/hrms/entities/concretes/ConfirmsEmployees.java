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
@Table(name="confirms_employees")

public class ConfirmsEmployees extends User {


	@Column(name="employee_id")
      private int employee_id;
	
	@Column(name="is_confirmed")
      private boolean is_confirmed;

}
