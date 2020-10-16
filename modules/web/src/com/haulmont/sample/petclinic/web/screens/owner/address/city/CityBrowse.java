package com.haulmont.sample.petclinic.web.screens.owner.address.city;

import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sample.petclinic.entity.owner.address.City;

@UiController("petclinic_City.browse")
@UiDescriptor("city-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class CityBrowse extends MasterDetailScreen<City> {
}