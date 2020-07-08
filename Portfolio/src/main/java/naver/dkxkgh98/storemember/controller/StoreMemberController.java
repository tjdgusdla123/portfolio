package naver.dkxkgh98.storemember.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import naver.dkxkgh98.storemember.service.StoreMemberService;

@Controller
public class StoreMemberController {

	@Autowired
private StoreMemberService storeMemberService;

	@RequestMapping(value = {"/", "index.html"}, method = RequestMethod.GET)
public String home(HttpServletRequest request, HttpServletResponse response) {
	//서비스의 메소드를 호출
		System.out.println("컨트롤 홈 도착");
	storeMemberService.allstoremember(request, response);
	return "home";
}
	//Controller 클래스에 상세보기를 위한 메소드를 구현
	@RequestMapping(value = {"detail/{membernickname}"}, method = RequestMethod.GET)
	public String detail(HttpServletRequest request, HttpServletResponse response) {
		//서비스의 메소드를 호출
		System.out.println("컨트롤 디테일 도착");
		storeMemberService.detailstoremember(request,response);
		return "detail";
				
}
}