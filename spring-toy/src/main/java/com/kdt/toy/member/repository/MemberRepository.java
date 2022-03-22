package com.kdt.toy.member.repository;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.kdt.toy.member.dto.JoinForm;
import com.kdt.toy.member.dto.Member;

public interface MemberRepository {
	
	@Insert("insert into member(user_id, password, email, tell)"
			+ " values(#{userId},#{password},#{email},#{tell})")
	void insertMember(JoinForm form);
	
	Member selectMemberByUserId(@Param("userId")String userId);
	
	@Select("select * from member where user_id = #{userId} and password = #{password}")
	Member authenticateUser(@Param("userId")String userId, @Param("password")String password);

	
	
	
	
	
	
	
	
}
