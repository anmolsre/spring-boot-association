package io.teena.userstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserRepo repo;
	public void saveUser(User user) {
		repo.save(user);
	}

}
