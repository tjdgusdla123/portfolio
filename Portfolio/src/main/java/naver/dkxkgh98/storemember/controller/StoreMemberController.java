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
	storeMemberService.allstoremember(request, response);
	return "home";
}
}
