package naver.dkxkgh98.smartorder.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import naver.dkxkgh98.smartorder.service.StoreMemberService;

@RestController
public class StoreMemberRestController {

	@Autowired
	private StoreMemberService storeMemberService;

	// Controller 클래스에 상세보기를 위한 메소드를 구현
	@RequestMapping(value = { "detail/{membernickname}" }, method = RequestMethod.GET)
	public String detail(HttpServletRequest request, HttpServletResponse response) {
		// 서비스의 메소드를 호출
		System.out.println("컨트롤 디테일 도착");
		storeMemberService.detailstoremember(request, response);
		return "detail";

	}
	//회원가입을 처리하는 메소드
	@RequestMapping(value="user/join",method=RequestMethod.POST)
	public Map<String,Object> join(HttpServletRequest request, HttpServletResponse response){
		//서비스의 메소드를 호출
		Map<String,Object> map = storeMemberService.join(request, response);
		
		return map;
		
	}
    
}