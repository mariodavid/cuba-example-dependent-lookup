alter table PETCLINIC_OWNER add constraint FK_PETCLINIC_OWNER_ADDRESS foreign key (ADDRESS_ID) references PETCLINIC_ADDRESS(ID);
