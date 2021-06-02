package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobExperience;

public interface JobExperienceService {
	Result add(JobExperience jobExperinence);

	DataResult<List<JobExperience>> findAllByJobSeeker_IdOrderByResignationTimeDesc(int jobSeekerId);
}
