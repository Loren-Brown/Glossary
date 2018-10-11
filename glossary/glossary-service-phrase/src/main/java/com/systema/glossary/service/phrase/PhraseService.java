package com.systema.glossary.service.phrase;

import java.util.List;

import com.systema.glossary.model.phrase.Phrase;

public interface PhraseService {
	
	public Phrase createPhrase(Phrase phrase);
	
	public void deletePhrase(Long id);
	
	public List<Phrase> getAllPhrases();
	
	public Phrase getPhraseById(Long id);
	
	public List<Phrase> getPhraseListByTextMatch(String searchText);
	
}