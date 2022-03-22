package com.kdt.toy.member.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Member {
	
	private String userId;
	private String password;
	private String email;
	private String grade;
	private String tell;
	private LocalDateTime regDate;
	private Integer isLeave;

}
