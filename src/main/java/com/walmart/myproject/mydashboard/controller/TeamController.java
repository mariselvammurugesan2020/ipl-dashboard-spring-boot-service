package com.walmart.myproject.mydashboard.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.walmart.myproject.mydashboard.model.Match;
import com.walmart.myproject.mydashboard.model.Team;
import com.walmart.myproject.mydashboard.repository.MatchRepository;
import com.walmart.myproject.mydashboard.repository.TeamRepository;

@RestController
@CrossOrigin
public class TeamController {

	private TeamRepository teamRepository;

	private MatchRepository matchRepository;

	@GetMapping("/team/{teamName}")
	public Team getTeam(@PathVariable String teamName,@RequestParam Optional<Integer> pageNo ,@RequestParam Optional<Integer> noOfRecords ) {
		Team team = teamRepository.findByTeamName(teamName);
		List<Match> matches = matchRepository.findLatestMatchesByTeam(teamName, noOfRecords.isPresent()?noOfRecords.get():9999999);
		team.setMatches(matches);
		return team;
	}
	
	@GetMapping("/team")
	public Iterable<Team> getTeam() {
		return teamRepository.findAll();
	}

	public TeamController(TeamRepository teamRepository, MatchRepository matchRepository) {
		this.teamRepository = teamRepository;
		this.matchRepository = matchRepository;
	}
	@GetMapping("/team/{teamName}/matches")
	public List<Match> getTeam(@PathVariable String teamName,@RequestParam int year, @RequestParam Optional<Integer> pageNo ,@RequestParam Optional<Integer> noOfRecords ) {
		LocalDate startDate = LocalDate.of(year, 1, 1);
		LocalDate endDate = LocalDate.of(year+1, 1, 1);
		List<Match> matches = matchRepository.getMatchesByTeamBetweenDates(teamName,startDate,endDate);
		return matches;
	} 
}
