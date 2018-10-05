package com.systema.glossary.service.phrase;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.systema.glossary.service.phrase.model.Phrase;

@Service("phrase-service")
public class PhraseServiceImpl implements PhraseService {

	public Phrase createPhrase(Phrase phrase) {
		return new Phrase();
	}
	
	public void deletePhrase(Long id) {
		return;
	}

	public List<Phrase> getAllPhrases() {
		return new ArrayList<Phrase>();
	}

	public Phrase getPhraseById(Long id) {
		return new Phrase();
	}

	public List<Phrase> getPhraseListByTextMatch(String searchText) {
		return new ArrayList<Phrase>();
	}
}