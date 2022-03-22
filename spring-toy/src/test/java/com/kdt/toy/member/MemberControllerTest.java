package com.kdt.toy.member;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringJUnitWebConfig(locations = "file:src/main/webapp/WEB-INF/spring/**/*-context.xml")
public class MemberControllerTest {
	
	MockMvc mockMvc;

    @BeforeEach
    void setup(WebApplicationContext wac) {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @DisplayName("회원가입 테스트")
    @Test
    public void join() throws Exception {
    	mockMvc.perform(post("/member/join")
    			.param("userId", "testTransaction")
    			.param("password", "12345678")
    			.param("tell", "1234")
    			.param("email", "aaa@bbb.com"))
    	.andDo(print());
    }
    
    
    
    
    
    
    
    
}
