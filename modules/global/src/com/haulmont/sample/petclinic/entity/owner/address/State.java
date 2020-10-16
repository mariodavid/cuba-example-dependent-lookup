package com.haulmont.sample.petclinic.entity.owner.address;

import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.sample.petclinic.entity.NamedEntity;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "PETCLINIC_STATE")
@Entity(name = "petclinic_State")
public class State extends NamedEntity {

    private static final long serialVersionUID = -2612715783018427293L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "COUNTRY_ID")
    @Lookup(type = LookupType.DROPDOWN, actions = {})
    private Country country;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}