package com.spotv.controller;

import java.util.ArrayList;
import java.util.List;

import com.spotv.controller.UserController;
import com.spotv.model.Comment;

public class CommentController {

	List<Comment> comments = new ArrayList<>();
	UserController uc = new UserController();
	
	
	
	    // C
        public void addComment(String id, String password, Comment comment) {
		
		if(uc.login(id,password)) {
			comments.add(comment);
		}
		
	}
        // R
        public Comment viewComment(int index) {
    		
    		return comments.get(index);
    		
    	}
    	// U 
    	public void updateComment(int index,  Comment comment) {
    		comments.set(index , comment);
    	}
    	// D 
    	public void deleteComment(int index) {
    		comments.remove(index);
    	}
	
}
