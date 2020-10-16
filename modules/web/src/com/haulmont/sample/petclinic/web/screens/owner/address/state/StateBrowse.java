package com.haulmont.sample.petclinic.web.screens.owner.address.state;

import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sample.petclinic.entity.owner.address.State;

@UiController("petclinic_State.browse")
@UiDescriptor("state-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class StateBrowse extends MasterDetailScreen<State> {
}