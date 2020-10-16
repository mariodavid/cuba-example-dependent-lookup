-- begin PETCLINIC_PET
create table PETCLINIC_PET (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    NAME varchar(255),
    --
    IDENTIFICATION_NUMBER varchar(255) not null,
    BIRTH_DATE date,
    TYPE_ID varchar(36),
    OWNER_ID varchar(36),
    --
    primary key (ID)
)^
-- end PETCLINIC_PET
-- begin PETCLINIC_PET_TYPE
create table PETCLINIC_PET_TYPE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    NAME varchar(255),
    --
    COLOR varchar(255),
    --
    primary key (ID)
)^
-- end PETCLINIC_PET_TYPE
-- begin PETCLINIC_OWNER
create table PETCLINIC_OWNER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    FIRST_NAME varchar(255) not null,
    LAST_NAME varchar(255),
    --
    EMAIL varchar(255),
    ADDRESS_ID varchar(36),
    TELEPHONE varchar(255),
    --
    primary key (ID)
)^
-- end PETCLINIC_OWNER
-- begin PETCLINIC_VETERINARIAN
create table PETCLINIC_VETERINARIAN (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    FIRST_NAME varchar(255) not null,
    LAST_NAME varchar(255),
    --
    primary key (ID)
)^
-- end PETCLINIC_VETERINARIAN
-- begin PETCLINIC_SPECIALTY
create table PETCLINIC_SPECIALTY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end PETCLINIC_SPECIALTY
-- begin PETCLINIC_VISIT
create table PETCLINIC_VISIT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TYPE_ varchar(50) not null,
    ASSIGNED_NURSE_ID varchar(36),
    PET_ID varchar(36) not null,
    VISIT_START timestamp not null,
    VISIT_END timestamp not null,
    DESCRIPTION varchar(4000),
    TREATMENT_STATUS varchar(50),
    --
    primary key (ID)
)^
-- end PETCLINIC_VISIT
-- begin PETCLINIC_VETERINARIAN_SPECIALTY_LINK
create table PETCLINIC_VETERINARIAN_SPECIALTY_LINK (
    VET_ID varchar(36) not null,
    SPECIALTY_ID varchar(36) not null,
    primary key (VET_ID, SPECIALTY_ID)
)^
-- end PETCLINIC_VETERINARIAN_SPECIALTY_LINK
-- begin PETCLINIC_ADDRESS
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
)^
-- end PETCLINIC_ADDRESS
-- begin PETCLINIC_STREET
create table PETCLINIC_STREET (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    NAME varchar(255),
    --
    CITY_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end PETCLINIC_STREET
-- begin PETCLINIC_COUNTRY
create table PETCLINIC_COUNTRY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end PETCLINIC_COUNTRY
-- begin PETCLINIC_CITY
create table PETCLINIC_CITY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    NAME varchar(255),
    --
    STATE_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end PETCLINIC_CITY
-- begin PETCLINIC_STATE
create table PETCLINIC_STATE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    NAME varchar(255),
    --
    COUNTRY_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end PETCLINIC_STATE
