# CUBA Petclinic

<p align="center">
  <img src="https://github.com/cuba-platform/cuba-petclinic/blob/master/img/petclinic_logo_with_slogan.svg"/>
</p>


This Example extends the CUBA Petclinic example with a dependent lookup UI for drill down functionality 
on Address Lookup.

![Petclinic Dependent Lookup](img/cuba-example-dependent-lookup-overview.gif)


In the [address-edit.xml](modules/web/src/com/haulmont/sample/petclinic/web/screens/owner/address/address-edit.xml) the dependencies between the lookup fields are connected via the [dataLoadCoordinator](https://doc.cuba-platform.com/manual-latest/gui_DataLoadCoordinator.html) component:

```xml
<data>
    <!-- ... -->
    <collection id="countriesDc" class="com.haulmont.sample.petclinic.entity.owner.address.Country"
      view="_minimal">
      <loader id="countriesDl">
        <query>
          <![CDATA[select e from petclinic_Country e]]>
        </query>
      </loader>
    </collection>
    <collection id="statesDc" class="com.haulmont.sample.petclinic.entity.owner.address.State"
      view="_minimal">
      <loader id="statesDl">
        <query>
          <![CDATA[select e from petclinic_State e where e.country = :container_countriesDc]]>
        </query>
      </loader>
    </collection>
    <collection id="citiesDc" class="com.haulmont.sample.petclinic.entity.owner.address.City"
      view="_minimal">
      <loader id="citiesDl">
        <query>
          <![CDATA[select e from petclinic_City e where e.state = :container_statesDc]]>
        </query>
      </loader>
    </collection>
    <collection id="streetsDc" class="com.haulmont.sample.petclinic.entity.owner.address.Street"
      view="_minimal">
      <loader id="streetsDl">
        <query>
          <![CDATA[select e from petclinic_Street e where e.city = :container_citiesDc]]>
        </query>
      </loader>
    </collection>
  </data>

  <facets>
    <dataLoadCoordinator auto="true"/>
  </facets>
```