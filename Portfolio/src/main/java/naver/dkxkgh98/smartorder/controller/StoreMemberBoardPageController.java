package naver.dkxkgh98.smartorder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import naver.dkxkgh98.smartorder.service.StoreMemberBoardService;

@Controller
public class StoreMemberBoardPageController {

	@Autowired
	private StoreMemberBoardService storeMemberBoardService;
	
	@RequestMapping(value ="board", method = RequestMethod.GET)
	public String board() {
		System.out.println("페이지controller도착-게시판"); 
		return "user/board";
}	
	
	//@RequestMapping(value =""
	
}
