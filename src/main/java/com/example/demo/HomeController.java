package com.example.demo;
import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
@Controller

public class HomeController {

	@Autowired  
    JdbcTemplate jdbc;
	
	@RequestMapping("/")
    public String home(Map<String, Object> model) {
        model.put("message", "HowToDoInJava Reader !!");
        return "home";
	}
	
	@RequestMapping("/admin")
	public String admin(){
		return "loginadmin";
		
	}   
	@RequestMapping("/user")
	public String user(){
		return "login";
	}  
	@RequestMapping("/customer")
	public String customer(){
		return "logincustomer";
	}  
	@RequestMapping("/customerpage")
	public String customerpage(){
		
		return "customerfrontpage";
	}  
	@RequestMapping("/userpage")
	public String userpage(){
		return "userfrontpage";
	}  
	@RequestMapping("/adminpage")
	public String adminpage(){
		return "adminfrontpage";
	}  
	@RequestMapping("/tracking")
	public String tracking(){
		return "tracking";
	}  
	@RequestMapping("/parceldistribution")
	public String parceldistribution(){
		return "parceldistribution";
	} 
	@RequestMapping("/payment")
	public String payment(){
		return "payment";
	} 
	@RequestMapping("/history")
	public String history(){
		return "history";
	} 
	@RequestMapping("/billing")
	public String billing(){
		return "billing";
	} 
	@RequestMapping("/userdetails")
	public String userdetails(){
		return "userdetails";
	} 
}
