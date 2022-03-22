package com.kdt.toy.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.kdt.toy.member.dto.JoinForm;
import com.kdt.toy.member.dto.Member;
import com.kdt.toy.member.service.MemberService;
import com.kdt.toy.member.validator.JoinFormValidator;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("member")
public class MemberController {
	
	private final MemberService memberService;
	private final JoinFormValidator joinFormValidator;
	
	@InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.addValidators(joinFormValidator);
    }
	
	@GetMapping("join")
	public String join() {
		return "member/join-form";
	}
	
	@PostMapping("join")
	public String join(@Validated JoinForm form
					, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			return "member/join-form";
		}
		
		memberService.insertMember(form);
		return "redirect:/";
	}
	
	@GetMapping("login")
	public void login() {}
	
	@PostMapping("login")
	public String login(String userId
					, String password
					, HttpSession session
					, RedirectAttributes redirectAttributes) {
		
		Member member = memberService.authenticateUser(userId, password);
		
		if(member == null) {
			redirectAttributes.addAttribute("msg","아이디나 비밀번호가 틀렸습니다 뀨!");
			return "redirect:/member/login";
		}
		
		session.setAttribute("authenticated", member);
		return "redirect:/";
	}
	
	@GetMapping("logout")
	public String logout(HttpSession session) {
		session.removeAttribute("authenticated");
		return "redirect:/";
	}
	

	
}
