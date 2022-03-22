package com.kdt.toy.member.service;

import com.kdt.toy.member.dto.JoinForm;
import com.kdt.toy.member.dto.Member;

public interface MemberService {
	
	void insertMember(JoinForm form);

	Member authenticateUser(String userId, String password);

}
