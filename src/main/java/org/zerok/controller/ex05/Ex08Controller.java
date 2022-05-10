package org.zerok.controller.ex05;

import java.util.*;

import javax.servlet.http.*;

import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;
import org.zerok.controller.ex03.*;

@Controller
@RequestMapping("ex08")
public class Ex08Controller {
	
	@RequestMapping("sub01")
	public String method01(HttpServletRequest req) {
		
		req.setAttribute("address", "new york");
		
		// prefix: /WEB-INF/views/
		// suffix: .jsp
		// view name: /WEB-INF/views/ex08/sub01.jsp
		return "ex08/sub01";
	}
	
	@RequestMapping("sub02")
	public String method02(Model model) {
		model.addAttribute("address", "london");
		return "ex08/sub01";
	}
	
	@RequestMapping("sub03")
	public String method03(Model model) {
		
		model.addAttribute("myName", "James");
		model.addAttribute("myAge", 28);
		return "ex08/sub03";
	}
	
	// view name: /WEB-INF/views/ex08/sub04.jsp
	// localhost:8080/controller/ex08/sub04
	@RequestMapping("sub04")
	public void method04(Model model) {
		model.addAttribute("foods", new String[] {"apple", "milk", "coffee"});
	}
	
	@RequestMapping("sub05")
	public void method05(Model model) {
		model.addAttribute("heroList", new String[] {"IronMan", "SpiderMan", "Thor"});
	}
	@RequestMapping("sub06")
	public void method06(Model model) {
		Map<String, String> map = new HashMap<>();
		map.put("name", "jin");
		map.put("song", "butter");
		map.put("group", "bts");
		
		model.addAttribute("desc", map);
	}
	
	@RequestMapping("sub07")
	public void method07(Model model) {
		Customer cus = new Customer();
		cus.setAddress("NY");
		cus.setName("donald");
		cus.setAge(33);
		
		model.addAttribute("customer", cus);
	}
	
	@RequestMapping("sub08")
	public void method08(Model model) {
		Employee emp = new Employee();
		// email, name, salary setting
		// jsp와 이 메소드를 완성해서 위에 세팅한 email, name, salary 출력되도록 하세요
		emp.setEmail("xeleb73876@chokxus.com");
		emp.setName("Ronaldo");
		emp.setSalary(800000);
		
		model.addAttribute("employee", emp);
	}
	
	@RequestMapping("sub09")
	public String method09(Model model) {
		
		Employee emp = new Employee();
		emp.setEmail("korea@daum.net");
		emp.setName("sunja");
		emp.setSalary(50000);
		
		// model.addAttribute("employee", emp);
		model.addAttribute(emp); // attribute 이름이 클래스의 이름으로 결정이 됨(단, lowerCamelCase형식)
		
		
		return "ex08/sub08";
	}
	
	@RequestMapping("sub10")
	public String method10(Model model)	{
		
		// model.addAttribute(Object)를 사용해서
		// sub07.jsp에서 고객의 정보가 출력되도록 코드를 완성
		
		Customer cus = new Customer();
		cus.setAddress("London");
		cus.setAge(30);
		cus.setName("Son");
		
		model.addAttribute(cus);
		return "ex08/sub07";
	}
	
	@RequestMapping("sub11")
	public void method11(Model model) {
		List<String> l = new ArrayList<>();
		
		l.add("wanda");
		l.add("doctor");
		l.add("wong");
		
		model.addAttribute("arrayList", l);
	}
	
	@RequestMapping("sub12")
	public void method12() {
		// 3. add attribute
	}
}








