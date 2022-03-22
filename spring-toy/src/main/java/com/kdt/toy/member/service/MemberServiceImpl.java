package com.kdt.toy.member.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kdt.toy.member.dto.JoinForm;
import com.kdt.toy.member.dto.Member;
import com.kdt.toy.member.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{
	
	private final MemberRepository memberRepository;
	
	@Override
	@Transactional
	public void insertMember(JoinForm form) {
		memberRepository.insertMember(form);
		//회원가입 환영 이메일 발송
		//이메일 발송 실패
		//예외 발생
		//String error = null;
		//error.charAt(0);
	}

	@Override
	public Member authenticateUser(String userId, String password) {
		return memberRepository.authenticateUser(userId,password);
	}
}
