package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
@EqualsAndHashCode(callSuper=false)
@Entity
@Table(name = "job_seekers")
@Data
@PrimaryKeyJoinColumn(name = "user_id",referencedColumnName = "id")
@AllArgsConstructor
@NoArgsConstructor
public class JobSeeker extends User{

	
	@Column(name= "first_name")
	private String firstName;
	
	@Column(name= "last_name")
	private String lastName;
	
	@Column(name= "national_id")
	private String nationalId;
	
	@Column(name= "date_of_birth")
	private LocalDate dateOfBirth;
	
	@Column(name = "is_verified", columnDefinition = "boolean default false")
	private boolean isVerified = false;
	
	@OneToMany(mappedBy="jobSeeker")
	private List<Skill> skills;
	
	@OneToMany(mappedBy="jobSeeker")
	private List<School> school;
	
	@OneToMany(mappedBy="jobSeeker")
	private List<Link> link;
	
	@OneToMany(mappedBy="jobSeeker")
	private List<Language> language;
	
	@OneToMany(mappedBy="jobSeeker")
	private List<JobExperience> jobExperience;
	
	@OneToMany(mappedBy="jobSeeker")
	private List<CoverLetter> coverLetter;
	

}
