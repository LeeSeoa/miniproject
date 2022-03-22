package com.kdt.toy.member.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.kdt.toy.member.dto.JoinForm;
import com.kdt.toy.member.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class JoinFormValidator implements Validator{
	
	private final MemberRepository memberRepository;

	@Override
	public boolean supports(Class<?> clazz) {
		return JoinForm.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		JoinForm form = (JoinForm) target;
		
		//이미 존재하는 아이디라면 벨리데이터를 통과하지 못함
		if(memberRepository.selectMemberByUserId(form.getUserId()) != null) {
			errors.rejectValue("userId", null, "이미 존재하는 아이디 입니다.");
		}
		
		//비밀번호가 8자리 미만이면 통과 x
		if(form.getPassword().length() < 8) {
			errors.rejectValue("password", null, "비밀번호가 8자리 미만");
		}

		
	}
}
