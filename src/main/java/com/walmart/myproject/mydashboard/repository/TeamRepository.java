package com.walmart.myproject.mydashboard.repository;

import org.springframework.data.repository.CrudRepository;

import com.walmart.myproject.mydashboard.model.Team;

public interface TeamRepository extends CrudRepository<Team, Long> {

	Team findByTeamName(String teamName);
}
