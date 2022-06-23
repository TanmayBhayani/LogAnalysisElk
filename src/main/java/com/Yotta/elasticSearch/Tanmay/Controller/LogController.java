package com.Yotta.elasticSearch.Tanmay.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Yotta.elasticSearch.Tanmay.Service.LogService;

@Controller
@RequestMapping("/Log")
public class LogController {
	
	@Autowired
	private LogService logService;
//	
//	@Autowired
//	public LogController(LogService logService) {
//		super();
//		this.logService = logService;
//	}

//	@PostMapping
//	public void save(@RequestBody final Log log) {
//		logService.save(log);
//	}
//	
//	@GetMapping("/{id}")
//	public Log findById(@PathVariable final long id)
//	{
//		return logService.findById(id);
//	}
	
	@RequestMapping("/Logs")
	public String getLogs(Model m)
	{
		m.addAttribute("Logs", logService.getAllLogs());
		return "result";
	}
	@GetMapping(value = "/")
	public ModelAndView getID(@RequestParam int id)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("Logs",logService.getLogByID(id));
		mv.setViewName("result");
		return mv;
	}
	
}
