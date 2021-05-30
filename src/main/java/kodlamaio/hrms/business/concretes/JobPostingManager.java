package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobPostingService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.JobPostingDao;
import kodlamaio.hrms.entities.concretes.JobPosting;

@Service
public class JobPostingManager implements JobPostingService{
	
	private JobPostingDao jobPostingDao;

	public JobPostingManager(JobPostingDao jobPostingDao) {
		super();
		this.jobPostingDao = jobPostingDao;
	}

	@Override
	public DataResult<List<JobPosting>> getAll() {
		return new SuccessDataResult<List<JobPosting>>
		(this.jobPostingDao.findAll());
	}

	@Override
	public DataResult<List<JobPosting>> getByAllOpenJobPostingList() {
		return new SuccessDataResult<List<JobPosting>>
		(this.jobPostingDao.getByAllOpenJobPostingList());
	}

	@Override
	public DataResult<List<JobPosting>> getByFindAllByOrderByPublishedAtDesc() {
		return new SuccessDataResult<List<JobPosting>>
		(this.jobPostingDao.getByFindAllByOrderByPublishedAtDesc());
	}

	@Override
	public DataResult<List<JobPosting>> getByFindAllByOrderByPublishedAtAsc() {
		return new SuccessDataResult<List<JobPosting>>
		(this.jobPostingDao.getByFindAllByOrderByPublishedAtAsc());
	}

	@Override
	public DataResult<List<JobPosting>> getByAllOpenJobAdvertByEmployer(int id) {
		return new SuccessDataResult<List<JobPosting>>
		(this.jobPostingDao.getByAllOpenJobAdvertByEmployer());
	}

}
