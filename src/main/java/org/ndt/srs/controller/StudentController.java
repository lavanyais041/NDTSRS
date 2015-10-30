package org.ndt.srs.controller;

import org.ndt.srs.entity.Student;
import org.ndt.srs.service.StudentService;
import org.ndt.srs.util.PasswordGenerationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController 
{
     @Autowired
	 private MailSender mailSender;
	
    
     
	@Autowired
	StudentService studentService;
	@RequestMapping(value="/createStudent",method=RequestMethod.POST)
	public String create(@ModelAttribute("student") Student s)
	{
		System.out.println("Hello");
		studentService.createstudent(s);
		PasswordGenerationUtil pswdUtil=new PasswordGenerationUtil();
		String studentPassword=pswdUtil.generateRandomPassword();
		SimpleMailMessage message = new SimpleMailMessage();
		//message.setFrom("lavanyais041@gmail.com");
		message.setFrom("lavanyais041@gmail.com");
        message.setTo(s.getMailId());
        message.setSubject("REGISTRATION CONFIRMATION - Thanks for Registering"+" "+s.getFirstName());
        message.setText("Your password is:"+studentPassword);
        mailSender.send(message);
		return "hello";
		
	}
	
	

	public void setMailSender(MailSender mailSender)
	{
		this.mailSender = mailSender;
	}



	@RequestMapping(value="/register",method=RequestMethod.GET)
	public ModelAndView showForm()
	{
		System.out.println("HAI");
		ModelAndView mv = new ModelAndView("register");
        mv.addObject("command", new Student());
        return mv;
		
		
	}
}
