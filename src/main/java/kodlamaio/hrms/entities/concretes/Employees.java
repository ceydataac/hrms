package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisements"})

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employees")

public class Employees extends User {

	@Column(name="first_name")
      private String firstName;
	
	@Column(name="last_name")
      private String lastName;
	
}
