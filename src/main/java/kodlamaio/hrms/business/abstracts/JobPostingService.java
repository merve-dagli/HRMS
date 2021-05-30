package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.JobPosting;

public interface JobPostingService {
	DataResult<List<JobPosting>> getAll();
	DataResult<List<JobPosting>> getByAllOpenJobPostingList();
	DataResult<List<JobPosting>> getByFindAllByOrderByPublishedAtDesc();
	DataResult<List<JobPosting>> getByFindAllByOrderByPublishedAtAsc();
	DataResult<List<JobPosting>> getByAllOpenJobAdvertByEmployer(int id);

}
