package com.systema.glossary.service.database.mapper;

import com.systema.glossary.model.phrase.Phrase;

import java.util.List;
import org.apache.ibatis.annotations.*;
//import org.apache.ibatis.mapping.StatementType;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface PhraseMapper {

    @Select("select id, acronym, expression, description from users")
    List<Phrase> getAllPhrases();

}