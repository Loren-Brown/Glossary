package com.systema.glossary.service.phrase;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.systema.glossary.model.phrase.Phrase;
import com.systema.glossary.service.database.mapper.PhraseMapper;

@Service("phrase-service")
public class PhraseServiceImpl implements PhraseService {
	
	@Autowired
	protected PhraseMapper phraseMapper;

	public Phrase createPhrase(Phrase phrase) {
		return phrase;
	}

	public void deletePhrase(Long id) {
		return;
	}

	public List<Phrase> getAllPhrases() {
		return phraseMapper.getAllPhrases();
	}

	public Phrase getPhraseById(Long id) {
		Phrase tempPhrase = new Phrase(id, "IDE", "Integrated Development Dnvironment",
				"An integrated development environment (IDE) is a software application that provides comprehensive facilities to computer programmers for software development. An IDE normally consists of a source code editor, build automation tools, and a debugger.");

		return tempPhrase;
	}

	public List<Phrase> getPhraseListByTextMatch(String searchText) {

		List<Phrase> tempList = new ArrayList<Phrase>();
		tempList.add(new Phrase(1L, "IDE", "Integrated Development Dnvironment",
				"An integrated development environment (IDE) is a software application that provides comprehensive facilities to computer programmers for software development. An IDE normally consists of a source code editor, build automation tools, and a debugger."));
		tempList.add(new Phrase(2L, "IDE", "Integrated Development Dnvironment",
				"An integrated development environment (IDE) is a software application that provides comprehensive facilities to computer programmers for software development. An IDE normally consists of a source code editor, build automation tools, and a debugger."));
		tempList.add(new Phrase(3L, "IDE", "Integrated Development Dnvironment",
				"An integrated development environment (IDE) is a software application that provides comprehensive facilities to computer programmers for software development. An IDE normally consists of a source code editor, build automation tools, and a debugger."));

		return tempList;
	}
}