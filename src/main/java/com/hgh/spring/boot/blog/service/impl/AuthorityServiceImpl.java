/**
 * 
 */
package com.hgh.spring.boot.blog.service.impl;

import com.hgh.spring.boot.blog.domain.Authority;
import com.hgh.spring.boot.blog.repository.AuthorityRepository;
import com.hgh.spring.boot.blog.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Authority 服务.
 */
@Service
public class AuthorityServiceImpl  implements AuthorityService {
	
	@Autowired
	private AuthorityRepository authorityRepository;
	
	@Override
	public Authority getAuthorityById(Long id) {
		return authorityRepository.findOne(id);
	}

}
