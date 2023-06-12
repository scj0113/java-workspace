package com.spotv.impl;

import com.spotv.model.Comment;

public interface CommentControllerImpl {
	
	
	public void addComment(String id, String password, Comment comment);    // 댓글 작성(추가)
	public Comment viewComment(int index);                                  // 댓글 보기
	public void updateComment(int index,  Comment comment);                 // 댓글 수정
	public void deleteComment(int index);                                   // 댓글 삭제

}
