package io.teena.userstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saveUser")
public class UserController {
	
	@Autowired
	private UserService userServ;
	
	@PostMapping
	private void saveUserInfo(@RequestBody User user) 
	{
		userServ.saveUser(user);
	}


}
