package com.Yotta.elasticSearch.Tanmay.Service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Yotta.elasticSearch.Tanmay.Model.Log;
import com.Yotta.elasticSearch.Tanmay.Repository.LogRepository;

@Service
public class LogService {
	List<Log> logs = Arrays.asList(
			new Log(992113,"Name:Tanmay,Location:Japan"),
			new Log(821123,"Name:Gergory,Location:Finland"),
			new Log(011274,"Name:Rahul,Location:India")
		);
	
	public List<Log> getAllLogs()
	{
		return logs;
	}
	public Log getLogByID(long id)
	{
		for(Log log:logs)
		{
			if(log.getId()==id)
				return log;
		}
		return null;
	}
//	private LogRepository repository;	
//	
//	@Autowired
//	public LogService(LogRepository repository) {
//		super();
//		this.repository = repository;
//	}
//	public void save(final Log log)
//	{
//		repository.save(log);
//	}
//	public Log findById(final long id)
//	{
//		return repository.findById(id).orElse(null);
//	}
}
