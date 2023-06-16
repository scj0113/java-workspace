package com.spotv.model;

public class Info {

	
	private String playerInfo;
	private String teamInfo;
	public Info() {
	}
	public Info(String playerInfo, String teamInfo) {
		this.playerInfo = playerInfo;
		this.teamInfo = teamInfo;
	}
	public String getPlayerInfo() {
		return playerInfo;
	}
	public void setPlayerInfo(String playerInfo) {
		this.playerInfo = playerInfo;
	}
	public String getTeamInfo() {
		return teamInfo;
	}
	public void setTeamInfo(String teamInfo) {
		this.teamInfo = teamInfo;
	}
	@Override
	public String toString() {
		return "Info [playerInfo=" + playerInfo + ", teamInfo=" + teamInfo + "]";
	}
	
	
}
