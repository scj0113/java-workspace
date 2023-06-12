package com.spotv.impl;

import com.spotv.model.User;

public interface UserControllerImpl {
	
	public void signUp(User user);                        // 회원가입
	public boolean login(String id, String password);     // 로그인
	public void deleteProfile(String id);                 // 계정 삭제
	

}
