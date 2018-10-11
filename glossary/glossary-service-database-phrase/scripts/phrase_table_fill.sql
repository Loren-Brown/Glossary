INSERT INTO phrase(id, acronym, expression, description)
VALUES
(
s_phrase.NextVal, 'CSFW', 'client server framework', 'helps managing client server communication'
);

INSERT INTO phrase(id, acronym, expression, description)
VALUES
(
s_phrase.NextVal, 'REST', 'REpresentational State Transfer', 'specifies how a client and a server exchange data'
);

INSERT INTO phrase(id, acronym, expression, description)
VALUES
(
s_phrase.NextVal, 'TIBCO', 'The Information Bus Company', 'real-time communication. Survived the dot com bubble'
);

INSERT INTO phrase(id, acronym, expression, description)
VALUES
(
s_phrase.NextVal, 'HP', 'Hawlett Packard', 'Helps people with pretty printing'
);

INSERT INTO phrase(id, acronym, expression, description)
VALUES
(
s_phrase.NextVal, 'POJO', 'Plain Old Java Object', 'A POJO is a Java object not bound by any restriction other than those forced by the Java Language Specification'
);
INSERT INTO phrase(id, acronym, expression, description)
VALUES
(
s_phrase.NextVal, 'MVC', 'Model View Controller', 'Model–view–controller is an architectural pattern commonly used for developing user interfaces that divides an application into three interconnected parts'
);

INSERT INTO phrase(id, acronym, expression, description)
VALUES
(
s_phrase.NextVal, 'AOP', 'aspect-oriented programming', 'In computing, aspect-oriented programming is a programming paradigm that aims to increase modularity by allowing the separation of cross-cutting concerns. It does so by adding additional behavior to existing code (an advice) without modifying the code itself, instead separately specifying which code is modified via a "pointcut" specification, such as "log all function calls when the function\"s name begins with "set"". '
);

INSERT INTO phrase(id, acronym, expression, description)
VALUES
(
s_phrase.NextVal, 'IoC', 'Inversion of control', 'In software engineering, inversion of control is a design principle in which custom-written portions of a computer program receive the flow of control from a generic framework. A software architecture with this design inverts control as compared to traditional procedural programming: in traditional programming, the custom code that expresses the purpose of the program calls into reusable libraries to take care of generic tasks, but with inversion of control, it is the framework that calls into the custom, or task-specific, code. '
);

INSERT INTO phrase(id, acronym, expression, description)
VALUES
(
s_phrase.NextVal, 'SQL', 'Structured Query Language', 'Structured Query Language is a domain-specific language used in programming and designed for managing data held in a relational database management system (RDBMS)'
);

INSERT INTO phrase(id, acronym, expression, description)
VALUES
(
s_phrase.NextVal, 'RDBMS', 'relational database management system', 'A relational database management system is a database management system (DBMS) based on the relational model invented by Edgar F. Codd at IBMs San Jose Research Laboratory. Most databases in widespread use today are based on his relational database model.'
);

INSERT INTO phrase(id, acronym, expression, description)
VALUES
(
s_phrase.NextVal, 'RDSMS', 'relational data stream management system', 'A relational data stream management system is a distributed, in-memory data stream management system (DSMS) that is designed to use standards-compliant SQL queries to process unstructured and structured data streams in real-time. Unlike SQL queries executed in a traditional RDBMS, which return a result and exit, SQL queries executed in a RDSMS do not exit, generating results continuously as new data become available. '
);

INSERT INTO phrase(id, acronym, expression, description)
VALUES
(
s_phrase.NextVal, 'MOM', 'Message Oriented Middleware', ''
);

INSERT INTO phrase(id, acronym, expression, description)
VALUES
(
s_phrase.NextVal, 'AMQP', 'Advanced Message Queuing Protocol', ''
);

INSERT INTO phrase(id, acronym, expression, description)
VALUES
(
s_phrase.NextVal, 'MQTT', 'Message Queue Telemetry Transport', ''
);

INSERT INTO phrase(id, acronym, expression, description)
VALUES
(
s_phrase.NextVal, 'TIB/RV', 'Rendezvous', 'The messaging system of TIBCO'
);

INSERT INTO phrase(id, acronym, expression, description)
VALUES
(
s_phrase.NextVal, 'AMQ', 'Apache Active MQ', ''
);

COMMIT;