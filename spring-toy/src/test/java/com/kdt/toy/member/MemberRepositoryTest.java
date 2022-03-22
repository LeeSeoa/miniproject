package com.kdt.toy.member;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;

import com.kdt.toy.member.dto.JoinForm;
import com.kdt.toy.member.dto.Member;
import com.kdt.toy.member.repository.MemberRepository;

@SpringJUnitWebConfig(locations = "file:src/main/webapp/WEB-INF/spring/**/*-context.xml")
public class MemberRepositoryTest {
	
	@Autowired
	private MemberRepository memberRepository;
	
	@DisplayName("회원가입 테스트")
	@Test
	public void insertMember() {
		JoinForm form = new JoinForm();
		form.setUserId("test3");
		form.setPassword("1234");
		form.setTell("010-1111-2222");
		form.setEmail("aaa@aaa.com");
		
		memberRepository.insertMember(form);
	}
	
	
	@DisplayName("아이디로 회원 조회")
	@Test
	public void selectMemberByUserId() {
		Member member = memberRepository.selectMemberByUserId("test");
		System.out.println(member);
	}
	
	
	
	
	

}
