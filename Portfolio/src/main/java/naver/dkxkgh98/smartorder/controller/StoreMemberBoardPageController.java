package naver.dkxkgh98.smartorder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import naver.dkxkgh98.smartorder.domain.StoreMemberBoard;
import naver.dkxkgh98.smartorder.service.StoreMemberBoardService;

@Controller

public class StoreMemberBoardPageController {

	@Autowired
	private StoreMemberBoardService storeMemberBoardService;
	//게시판 메인 
	@RequestMapping(value ="board", method = RequestMethod.GET)
	public String board() {
		System.out.println("페이지controller도착-게시판"); 
		return "user/boardmain";
}	//게시글 작성
	@RequestMapping(value ="boardwrite", method = RequestMethod.GET)
	public String boardwrite() {
		System.out.println("페이지controller도착-글쓰기"); 
		return "user/boardwrite";
}	
	
	//게시판 목록
	@RequestMapping(value ="boardlist", method = RequestMethod.GET)
	public String memberBoardList(Model model) {
		System.out.println("페이지controller게시판 목록 도착  ");
		List<StoreMemberBoard> list = storeMemberBoardService.memberBoardList();
		model.addAttribute("list", list);
		return "user/boardlist";
	}
	
}
