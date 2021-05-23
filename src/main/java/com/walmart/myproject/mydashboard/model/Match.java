package com.walmart.myproject.mydashboard.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Match {
	@Id
	private long id;
	private String city;
	private LocalDate date;
	private String playerofmatch;
	private String venue;
	private String team1;
	private String team2;
	private String tosswinner;
	private String tossdecision;
	private String matchwinner;
	private String result;
	private String resultmargin;
	private String umpire1;
	private String umpire2;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getPlayerofmatch() {
		return playerofmatch;
	}
	public void setPlayerofmatch(String playerofmatch) {
		this.playerofmatch = playerofmatch;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getTeam1() {
		return team1;
	}
	public void setTeam1(String team1) {
		this.team1 = team1;
	}
	public String getTeam2() {
		return team2;
	}
	public void setTeam2(String team2) {
		this.team2 = team2;
	}
	public String getTosswinner() {
		return tosswinner;
	}
	public void setTosswinner(String tosswinner) {
		this.tosswinner = tosswinner;
	}
	public String getTossdecision() {
		return tossdecision;
	}
	public void setTossdecision(String tossdecision) {
		this.tossdecision = tossdecision;
	}

	public String getMatchwinner() {
		return matchwinner;
	}
	public void setMatchwinner(String matchwinner) {
		this.matchwinner = matchwinner;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getResultmargin() {
		return resultmargin;
	}
	public void setResultmargin(String resultmargin) {
		this.resultmargin = resultmargin;
	}
	public String getUmpire1() {
		return umpire1;
	}
	public void setUmpire1(String umpire1) {
		this.umpire1 = umpire1;
	}
	public String getUmpire2() {
		return umpire2;
	}
	public void setUmpire2(String umpire2) {
		this.umpire2 = umpire2;
	}
	
}
