package com.systema.glossary.service.rest.phrase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;
import java.math.BigDecimal;

import com.systema.glossary.model.phrase.Phrase;
import com.systema.glossary.service.phrase.PhraseService;

@RestController
@RequestMapping("/glossary/v1")
public class PhraseRestController {

	@Autowired
	protected PhraseService phraseService;

	@RequestMapping(value = "/phrases", method = RequestMethod.GET)
	@ResponseBody
	public List<Phrase> getPhraseListBySearchText(@RequestParam(value = "search") Optional<String> searchString) {
		if (searchString.isPresent()) {
			return phraseService.getPhraseListByTextMatch(searchString.get());
		}
		return phraseService.getAllPhrases();
	}

	@RequestMapping(value = "phrases/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Phrase getPhraseById(@PathVariable("id") BigDecimal id) {
		return phraseService.getPhraseById(id);
	}

	@RequestMapping(value = "/phrases", method = RequestMethod.POST)
	@ResponseBody
	public Phrase createPhrase(@RequestBody Phrase newPhrase) {
		return phraseService.createPhrase(newPhrase);
	}

	@RequestMapping(value = "/phrases/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deletePhrase(@PathVariable("id") BigDecimal id) {
		phraseService.deletePhrase(id);
		return;
	}

}