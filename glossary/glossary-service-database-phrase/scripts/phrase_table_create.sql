-------------------------------------------------------------------------------
-- create tables and sequences
-------------------------------------------------------------------------------
-- Date:    2018/10
-- Company: SYSTEMA GmbH
-------------------------------------------------------------------------------

DROP TABLE phrase;
DROP SEQUENCE s_phrase;

---------------------------------------------------------------------------------
---- glossary's main table : phrase
---------------------------------------------------------------------------------
CREATE TABLE phrase (
    id NUMBER(10),
    acronym VARCHAR2(50),
    expression VARCHAR2(100),
    description VARCHAR2(1000),
    
    CONSTRAINT pk_glossary PRIMARY KEY (id)
);

CREATE SEQUENCE s_phrase
INCREMENT BY 1
START WITH 1  
MAXVALUE 9999999999 
NOCACHE
ORDER;


COMMIT;