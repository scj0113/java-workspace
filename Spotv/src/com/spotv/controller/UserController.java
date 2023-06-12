package com.spotv.controller;

import com.spotv.model.User;

public class UserController {
	
	
	User user = null;
	
	
	
	// C
	
	public void signUp(User user) {                                                            // 회원가입
		this.user = user;
	}
	
	public boolean login(String id, String password) {                                          // 로그인
		if(user != null && user.getId().equals(id) && user.getPassword().equals(password)) {
		return true;
	}
	  return false;
}	

	// R
	
	
	
	// U
	
	
	
	// D	
	public void deleteProfile(String id) {                     // 계정 삭제
		
		if(user.getId().equals(id)) {
			user = null;
		}
	
	}

}
