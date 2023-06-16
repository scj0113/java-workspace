package com.spotv.model;

import java.util.Date;

public class Video {
	
	private String title;               // 경기 제목
	private Date uploadAt;              // 당일 경기
	private String liveViews;           // live 경기 관람자수
	private String views;               // 조회수
	private char kind;                  // live인지 하이라이트인지 확인용
	public Video() {
	}
	public Video(String title, Date uploadAt, String liveViews, String views, char kind) {
		this.title = title;
		this.uploadAt = uploadAt;
		this.liveViews = liveViews;
		this.views = views;
		this.kind = kind;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getUploadAt() {
		return uploadAt;
	}
	public void setUploadAt(Date uploadAt) {
		this.uploadAt = uploadAt;
	}
	public String getLiveViews() {
		return liveViews;
	}
	public void setLiveViews(String liveViews) {
		this.liveViews = liveViews;
	}
	public String getViews() {
		return views;
	}
	public void setViews(String views) {
		this.views = views;
	}
	public char getKind() {
		return kind;
	}
	public void setKind(char kind) {
		this.kind = kind;
	}
	@Override
	public String toString() {
		return "Video [title=" + title + ", uploadAt=" + uploadAt + ", liveViews=" + liveViews + ", views=" + views
				+ ", kind=" + kind + "]";
	}
	
	
	
	

}
