package com.gura.spring04;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//1. Controller 가 될수 있도록 하는 어노테이션
@Controller
public class HomeController {
	
	//2. /home.do 요청을 처리할 메소드 어노테이션
	// .do 는 생략 가능하다 
	@RequestMapping("/home")
	public String home(HttpServletRequest request){
		
		//3. request 에 필요한 데이터를 담는다.
		request.setAttribute("personToday", "박경린");
		
		//4. view 페이지의 위치를 리턴해 준다. 
		//  "/WEB-INF/views/"+"home"+".jsp" 
		return "home";
	}
	
}







