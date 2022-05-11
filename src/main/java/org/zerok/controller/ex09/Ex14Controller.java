package org.zerok.controller.ex09;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerok.domain.ex01.CustomerDto;
import org.zerok.domain.ex01.EmployeeDto;
import org.zerok.service.ex02.Ex04Service;

@Controller
@RequestMapping("ex14")
public class Ex14Controller {
	
	@Autowired
	private Ex04Service service;
	
	@RequestMapping("sub01")
	public void method01(int id, Model model) {
		// 1. request parameter (int id)
		
		// 2. business logic
		String name = service.getNameById(id);
		// 3. model.addAttribute
		model.addAttribute("name", name);
		// 4. forward / redirect
	}
	
	// /ex14/sub02?id=3
	// view에서 Employee의 firstName이 출력 되도록
	
	// controller.method02 완성
	// service에도 메소드 추가
	// mapper에도 메소드 추가
	// jsp 작성
	@RequestMapping("sub02")
	public void method02(int id, Model model) {
		String firstName = service.getfirstNameById(id);
		model.addAttribute("firstName", firstName);
	}
	
	// /ex14/sub03?id=3
	@RequestMapping("sub03")
	public void method03(int id, Model model) {
		CustomerDto dto = service.getCustomerInfoById(id);
		
		model.addAttribute("customer", dto);
	}
	
	// /ex14/sub04?id=7
	// 직원의 FirstName, LastName이 모두 jsp 출력되도록
	
	// contorller에 새 메소드 작성
	// service에 새 메소드 작성
	// mapper에 새 메소드 작성
	// 새 jsp 파일 작성
	// 새 EmployeDto 작성
	
	@RequestMapping("sub04")
	public void method04(int id, Model model) {
		EmployeeDto dto = service.getEmployeeFullNameById(id);
		
		model.addAttribute("employee", dto);
	}
	
	@GetMapping("sub05")
	public void method05()	{
		// form 있는 jsp forward
	}
	@PostMapping("sub05")
	public String method06(CustomerDto customer, RedirectAttributes rttr) {
		// 1. request parameter
		System.out.println(customer);
		// 2. business logic
		boolean ok = service.addCustomer(customer);
		
		// 3.model attirbute
		if(ok) {
			rttr.addFlashAttribute("message", "등록완료");
		} else {
			rttr.addFlashAttribute("message", "등록실패");
		}
		// 4. redirect
		return "redirect:/ex14/sub05";
	
		
	}
	
	@GetMapping("sub06")
	public void method07()	{
		
	}
	@PostMapping("sub06")
	public String method08(EmployeeDto employee, RedirectAttributes rttr)	{
		System.out.println(employee);
		boolean right = service.addEmployee(employee);
		if(right) {
			rttr.addFlashAttribute("message", "Enrollment complete");
		} else {
			rttr.addFlashAttribute("message", "Enrollment fail");
		}
		return "redirect:/ex14/sub06";
	}
}











