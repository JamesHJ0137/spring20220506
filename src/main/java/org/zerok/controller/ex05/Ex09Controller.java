package org.zerok.controller.ex05;

import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;
import org.zerok.controller.ex03.*;

@Controller
@RequestMapping("ex09")
public class Ex09Controller {
	
	@RequestMapping("sub01")
	public void method01(String name, Model model)	{
		
		// 1. request parameter 수집/가공
		System.out.println(name);
		// 3. model에 attribute 추가
		model.addAttribute("name", name);
		// 4. view forward: ex09/sub01.jsp
		
	}
	
	@RequestMapping("sub02")
	public String method02(@ModelAttribute("name") String name) {
		System.out.println(name);
		return "ex09/sub01";
		
	}
	
	// http://localhost:8080/controller/ex09/sub03?address=seoul&email=seoul@gmail.com
	@RequestMapping("sub03")
	public void method03(@ModelAttribute("address") String address, 
			@ModelAttribute("email") String email) {
		
	}
	
	// http://localhost:8080/controller/ex09/sub04?name=trump&age=40&address=newyork
	@RequestMapping("sub04")
	// String으로 준 이유는 return값을 기존의 것을 쓰기 위해 사용했던 것
	public void method04(@ModelAttribute("customer") Customer cus) {
		
	}
	
	// http://localhost:8080/controller/ex09/sub05?name=trump&age=40&address=newyork
	@RequestMapping("sub05")
	public String method05(@ModelAttribute Customer cus) {
		
		return "ex09/sub04";
	}
	
	@RequestMapping("sub06")
	public String method06(Customer cus) {
		return "ex09/sub04";
	}
	
	// queryString : ?name=sunja&salary=50000&email=sunja@gmail.com
	// model에 employee라는 이름의 attribute로 추가되고
	// /ex09/sub07 뷰로 forward 되도록
//	@RequestMapping("sub07")
//	public String method07(Employee emp) {
//		return "ex09/sub07";
//	}
	
	@RequestMapping("sub07")
	public void method08(Employee emp) {

	}
}














