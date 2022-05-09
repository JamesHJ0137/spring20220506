package org.zerok.controller.ex04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex07")
public class Ex07Controller {
	
	@RequestMapping("sub01")
	public String method01() {
		// 1. request parameter
		// 2. business logic
		// 3. add attribute
		// 4. forward / redirect
		
		return "redirect:https://www.naver.com";
	}
	
	@RequestMapping("sub02")
	public String method02() {
		// /ex06/sub01로 redirection
		return "redirect:/ex06/sub02";
	}
	
	@RequestMapping("sub04")
	public String method03() {
		// /ex06/sub05로 리디렉션
		return "redirect:/ex06/sub05";
	}
}
