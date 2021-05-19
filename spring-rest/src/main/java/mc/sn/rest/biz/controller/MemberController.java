package mc.sn.rest.biz.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import mc.sn.rest.biz.vo.MemberVO;

public interface MemberController {
	public String searchMember(@RequestParam("id") String id, HttpServletRequest request, HttpServletResponse response) throws Exception;
	
}
