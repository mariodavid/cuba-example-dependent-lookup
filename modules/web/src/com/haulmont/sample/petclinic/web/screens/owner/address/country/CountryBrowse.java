package com.haulmont.sample.petclinic.web.screens.owner.address.country;

import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sample.petclinic.entity.owner.address.Country;

@UiController("petclinic_Country.browse")
@UiDescriptor("country-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class CountryBrowse extends MasterDetailScreen<Country> {
}