package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="job_postings")
@Entity
public class JobPosting {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	
	@Column(name="description")
	private String description;
	
	@Column(name="open_position_count")
	private int openPositionCount;
	
	@Column(name="published_at")
	private LocalDate publishedAt;
	
	@Column(name="deadline")
	private LocalDate deadline;
	
	@Column(name="is_open")
	private boolean isOpen;
	
	@Column(name="created_at")
	private LocalDate createdAt;
	
	@Column(name="salary_min")
	private int salaryMin;
	
	@Column(name="salary_max")
	private int salaryMax;
	
	@Column(name="is_active")
	private boolean isActive;
	
	@Column(name="is_deleted")
	private boolean isDeleted;
	
	@ManyToOne
	@JoinColumn(name="job_position_id")
	private JobPosition  jobPosition;
	
	@ManyToOne
	@JoinColumn(name="employer_id")
	private Employer  employer;
	
	@ManyToOne
	@JoinColumn(name="city_id")
	private City  city;
}
