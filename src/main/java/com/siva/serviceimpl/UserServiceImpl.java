package com.siva.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siva.model.User;
import com.siva.repo.UserRepo;
import com.siva.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private UserRepo repo;

	@Override
	public Integer saveUser(User user) {
		return repo.save(user).getUserId();
	}

}
