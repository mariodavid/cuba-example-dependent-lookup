package com.haulmont.sample.petclinic.web.screens.owner.address;

import com.haulmont.cuba.core.entity.Entity;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.HasValue.ValueChangeEvent;
import com.haulmont.cuba.gui.components.LookupField;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sample.petclinic.entity.owner.address.Address;
import com.haulmont.sample.petclinic.entity.owner.address.City;
import com.haulmont.sample.petclinic.entity.owner.address.Country;
import com.haulmont.sample.petclinic.entity.owner.address.State;
import com.haulmont.sample.petclinic.entity.owner.address.Street;
import javax.inject.Inject;

@UiController("petclinic_Address.edit")
@UiDescriptor("address-edit.xml")
@EditedEntityContainer("addressDc")
@LoadDataBeforeShow
public class AddressEdit extends StandardEditor<Address> {

    @Inject
    protected LookupField<Street> streetField;
    @Inject
    protected LookupField<City> cityField;
    @Inject
    protected LookupField<State> stateField;

    @Subscribe("cityField")
    protected void onCityFieldValueChange(ValueChangeEvent<City> event) {
        clearField(streetField, event);
    }

    @Subscribe("stateField")
    protected void onStateFieldValueChange(ValueChangeEvent<State> event) {
        clearField(cityField, event);
    }

    @Subscribe("countryField")
    protected void onCountryFieldValueChange(ValueChangeEvent<Country> event) {
        clearField(stateField, event);
    }

    private void clearField(LookupField<? extends Entity> field, ValueChangeEvent<? extends Entity> event) {
        if (event.getPrevValue() != event.getValue()) {
            field.setValue(null);
        }
    }

}