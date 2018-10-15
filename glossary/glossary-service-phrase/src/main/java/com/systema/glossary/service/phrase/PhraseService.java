package com.systema.glossary.service.phrase;

import java.util.List;
import java.math.BigDecimal;

import com.systema.glossary.model.phrase.Phrase;

public interface PhraseService {
	
	public Phrase createPhrase(Phrase phrase);
	
	public void deletePhrase(BigDecimal id);
	
	public List<Phrase> getAllPhrases();
	
	public Phrase getPhraseById(BigDecimal id);
	
	public List<Phrase> getPhraseListByTextMatch(String searchText);
	
}