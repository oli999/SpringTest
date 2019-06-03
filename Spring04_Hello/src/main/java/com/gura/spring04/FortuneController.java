package com.gura.spring04;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FortuneController {
	
	// "/fortune.do" 요청을 처리할 메소드
	@RequestMapping("/fortune")
	public String fortune(HttpServletRequest request){
		String fortuneToday="동쪽으로 가면 귀인을 만나요";
		// view page 에서 필요한 모델을 request 에 담는다.
		request.setAttribute("fortuneToday", fortuneToday);
		
		//view 페이지의 위치를 리턴해 준다.
		// "/WEB-INF/views/"+"fortune"+".jsp"
		return "fortune";
	}
}













