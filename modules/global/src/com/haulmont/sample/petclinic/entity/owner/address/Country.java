package com.haulmont.sample.petclinic.entity.owner.address;

import com.haulmont.sample.petclinic.entity.NamedEntity;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "PETCLINIC_COUNTRY")
@Entity(name = "petclinic_Country")
public class Country extends NamedEntity {

    private static final long serialVersionUID = -5647316752920557103L;
}