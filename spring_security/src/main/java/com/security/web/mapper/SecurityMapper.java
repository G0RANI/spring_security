package com.security.web.mapper;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.security.web.domain.SecurityDTO;

@Repository("securityMapper")
public class SecurityMapper {
	
	@Autowired
    private SqlSessionTemplate sqlSession;

	public SecurityDTO user(String username) {
        return sqlSession.selectOne("user.selectUserById", username);
    }
}
