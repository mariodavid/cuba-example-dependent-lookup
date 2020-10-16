create table PETCLINIC_ADDRESS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    COUNTRY_ID varchar(36) not null,
    STATE_ID varchar(36) not null,
    CITY_ID varchar(36) not null,
    POSTAL_CODE varchar(255),
    STREET_ID varchar(36) not null,
    HOUSE_NUMBER varchar(255),
    --
    primary key (ID)
);