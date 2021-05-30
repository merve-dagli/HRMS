package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobPostingService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.JobPosting;

@RestController
@RequestMapping("/api/jobPosting/")
public class JobPostingController {
	
	private JobPostingService jobPostingService;

	public JobPostingController(JobPostingService jobPostingService) {
		super();
		this.jobPostingService = jobPostingService;
	}
	
	@GetMapping("getAll")
	public DataResult<List<JobPosting>> getAll(){
		return this.jobPostingService.getAll();
	}
	
	@GetMapping("getByAllOpenJobPostingList")
	public DataResult<List<JobPosting>> getByAllOpenJobPostingList(){
		return this.jobPostingService.getByAllOpenJobPostingList();
	}
	
	@GetMapping("getByFindAllByOrderByPublishedAtDesc")
	public DataResult<List<JobPosting>> getByFindAllByOrderByPublishedAtDesc(){
		return this.jobPostingService.getByFindAllByOrderByPublishedAtDesc();
	}
	
	@GetMapping("getByFindAllByOrderByPublishedAtAsc")
	public DataResult<List<JobPosting>> getByFindAllByOrderByPublishedAtAsc(){
		return this.jobPostingService.getByFindAllByOrderByPublishedAtAsc();
	}
	
	@GetMapping("getByAllOpenJobAdvertByEmployer")
	public DataResult<List<JobPosting>> getByAllOpenJobAdvertByEmployer(int id){
		return this.jobPostingService.getByAllOpenJobAdvertByEmployer(id);
	}

}
