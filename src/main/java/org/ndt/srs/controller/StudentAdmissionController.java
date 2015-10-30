package org.ndt.srs.controller;


import org.ndt.srs.entity.Admission;
import org.ndt.srs.entity.Student;
import org.ndt.srs.service.StudentAdmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController 
{
 
 @Autowired	
 StudentAdmissionService studAdmissionService;
	
 @RequestMapping(value="/studentAdmission.html",method=RequestMethod.POST)
 public String studentAdmission(@ModelAttribute("admission") Admission a )
 {
	 
	 studAdmissionService.studentAdmission(a);
	 return "hello";
	 
 }
 
 @RequestMapping(value="/studentAdmission",method=RequestMethod.GET)
 public ModelAndView studentAdmission()
 {
	 ModelAndView mv = new ModelAndView("studentAdmission");
     mv.addObject("command", new Admission());
     return mv;
	 
 }
	
	
	
}
