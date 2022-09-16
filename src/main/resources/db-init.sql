CREATE SCHEMA Master;

CREATE SEQUENCE Master.SampleEntitySequence
    START WITH 1
    INCREMENT BY 50 ;

CREATE TABLE Master.Sample(
    Id bigint not null,
    SampleValue varchar(10) not null
);
