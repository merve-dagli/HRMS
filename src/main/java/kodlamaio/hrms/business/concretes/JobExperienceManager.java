package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobExperienceService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobExperienceDao;
import kodlamaio.hrms.entities.concretes.JobExperience;

@Service
public class JobExperienceManager implements JobExperienceService{
	
private JobExperienceDao jobExperineceDao;
	
	
	@Autowired
	public JobExperienceManager(JobExperienceDao jobExperineceDao) {
		super();
		this.jobExperineceDao = jobExperineceDao;
	}

	@Override
	public Result add(JobExperience jobExperinence) {
		this.jobExperineceDao.save(jobExperinence);
		return new SuccessResult("İş deneyimi eklendi!");
	}

	@Override
	public DataResult<List<JobExperience>> findAllByJobSeeker_IdOrderByResignationTimeDesc(int jobSeekerId) {
		return new SuccessDataResult<List<JobExperience>>(this.jobExperineceDao.findAllByJobSeeker_IdOrderByResignationTimeDesc(jobSeekerId));
	}

}
