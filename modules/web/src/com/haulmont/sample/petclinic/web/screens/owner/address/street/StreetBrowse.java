package com.haulmont.sample.petclinic.web.screens.owner.address.street;

import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sample.petclinic.entity.owner.address.Street;

@UiController("petclinic_Street.browse")
@UiDescriptor("street-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class StreetBrowse extends MasterDetailScreen<Street> {
}