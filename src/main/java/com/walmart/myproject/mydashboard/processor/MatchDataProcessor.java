package com.walmart.myproject.mydashboard.processor;

import java.time.LocalDate;

import org.springframework.batch.item.ItemProcessor;

import com.walmart.myproject.mydashboard.data.MatchInput;
import com.walmart.myproject.mydashboard.model.Match;

public class MatchDataProcessor implements ItemProcessor<MatchInput, Match> {

	@Override
	public Match process(final MatchInput matchInput) throws Exception {
		Match match = new Match();
		match.setId(Long.parseLong(matchInput.getId()));
		match.setCity(matchInput.getCity());
		match.setDate(LocalDate.parse(matchInput.getDate()));
		match.setPlayerofmatch(matchInput.getPlayerofmatch());
		match.setVenue(matchInput.getVenue());

		String firstInningsTeam, secondInningsTeam;
		if ("bat".equals(matchInput.getTossdecision())) {
			firstInningsTeam = matchInput.getTosswinner();
			secondInningsTeam = matchInput.getTosswinner().equals(matchInput.getTeam1()) ? matchInput.getTeam2()
					: matchInput.getTeam1();
		} else {
			secondInningsTeam = matchInput.getTosswinner();
			firstInningsTeam = matchInput.getTosswinner().equals(matchInput.getTeam1()) ? matchInput.getTeam2()
					: matchInput.getTeam1();
		}
		match.setTeam1(firstInningsTeam);
		match.setTeam2(secondInningsTeam);
		match.setTosswinner(matchInput.getTosswinner());
		match.setTossdecision(matchInput.getTossdecision());
		match.setMatchwinner(matchInput.getMatchwinner());
		match.setResult(matchInput.getResult());
		match.setResultmargin(matchInput.getResultmargin());
		match.setUmpire1(matchInput.getUmpire1());
		match.setUmpire2(matchInput.getUmpire2());

		return match;
	}

}