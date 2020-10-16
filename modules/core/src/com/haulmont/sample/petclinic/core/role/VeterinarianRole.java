package com.haulmont.sample.petclinic.core.role;

import com.haulmont.cuba.security.app.role.AnnotatedRoleDefinition;
import com.haulmont.cuba.security.app.role.annotation.EntityAccess;
import com.haulmont.cuba.security.app.role.annotation.EntityAttributeAccess;
import com.haulmont.cuba.security.app.role.annotation.Role;
import com.haulmont.cuba.security.app.role.annotation.ScreenAccess;
import com.haulmont.cuba.security.entity.EntityOp;
import com.haulmont.cuba.security.entity.User;
import com.haulmont.cuba.security.role.EntityAttributePermissionsContainer;
import com.haulmont.cuba.security.role.EntityPermissionsContainer;
import com.haulmont.cuba.security.role.ScreenPermissionsContainer;
import com.haulmont.sample.petclinic.entity.owner.Owner;
import com.haulmont.sample.petclinic.entity.owner.address.Address;
import com.haulmont.sample.petclinic.entity.owner.address.City;
import com.haulmont.sample.petclinic.entity.owner.address.Country;
import com.haulmont.sample.petclinic.entity.owner.address.State;
import com.haulmont.sample.petclinic.entity.owner.address.Street;
import com.haulmont.sample.petclinic.entity.pet.Pet;
import com.haulmont.sample.petclinic.entity.pet.PetType;
import com.haulmont.sample.petclinic.entity.veterinarian.Specialty;
import com.haulmont.sample.petclinic.entity.veterinarian.Veterinarian;
import com.haulmont.sample.petclinic.entity.visit.Visit;

@Role(name = VeterinarianRole.NAME)
public class VeterinarianRole extends AnnotatedRoleDefinition {

  public final static String NAME = "Veterinarian";

  @EntityAccess(entityClass = Street.class, operations = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
  @EntityAccess(entityClass = City.class, operations = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
  @EntityAccess(entityClass = State.class, operations = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
  @EntityAccess(entityClass = Country.class, operations = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
  @EntityAccess(entityClass = Address.class, operations = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
  @EntityAccess(entityClass = Visit.class, operations = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
  @EntityAccess(entityClass = Pet.class, operations = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
  @EntityAccess(entityClass = Owner.class, operations = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
  @EntityAccess(entityClass = PetType.class, operations = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
  @EntityAccess(entityClass = Specialty.class, operations = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
  @EntityAccess(entityClass = Veterinarian.class, operations = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
  @EntityAccess(entityClass = User.class, operations = {EntityOp.CREATE, EntityOp.READ, EntityOp.UPDATE, EntityOp.DELETE})
  @Override
  public EntityPermissionsContainer entityPermissions() {
    return super.entityPermissions();
  }

  @EntityAttributeAccess(entityClass = Street.class, modify = "*")
  @EntityAttributeAccess(entityClass = City.class, modify = "*")
  @EntityAttributeAccess(entityClass = State.class, modify = "*")
  @EntityAttributeAccess(entityClass = Country.class, modify = "*")
  @EntityAttributeAccess(entityClass = Address.class, modify = "*")
  @EntityAttributeAccess(entityClass = Owner.class, modify = "*")
  @EntityAttributeAccess(entityClass = Pet.class, modify = "*")
  @EntityAttributeAccess(entityClass = Visit.class, modify = "*")
  @EntityAttributeAccess(entityClass = PetType.class, modify = "*")
  @EntityAttributeAccess(entityClass = Specialty.class, modify = "*")
  @EntityAttributeAccess(entityClass = Veterinarian.class, modify = "*")
  @EntityAttributeAccess(entityClass = User.class, modify = "*")
  @EntityAttributeAccess(entityClass = Visit.class, modify = "pet") // TODO: remove when https://github.com/cuba-platform/cuba/issues/2869 is solved
  @Override
  public EntityAttributePermissionsContainer entityAttributePermissions() {
    return super.entityAttributePermissions();
  }


  @ScreenAccess(screenIds = {
      "petclinic_myVisits",
      "petclinic_Street.browse",
      "petclinic_City.browse",
      "petclinic_State.browse",
      "petclinic_Country.browse",
      "petclinic_Address.browse",
      "petclinic_Visit.browse",
      "petclinic_Address.edit",
      "petclinic_Visit.browse",
      "petclinic_Visit.edit",
      "petclinic_Pet.browse",
      "petclinic_Pet.edit",
      "petclinic_Owner.browse",
      "petclinic_Owner.edit",
      "petclinic_Veterinarian.browse",
      "petclinic_Veterinarian.edit",
      "petclinic_PetType.browse",
      "petclinic_PetType.edit",
      "petclinic_Specialty.browse",
      "petclinic_Specialty.lookup",
      "petclinic_Specialty.edit",
  })
  @Override
  public ScreenPermissionsContainer screenPermissions() {
    return super.screenPermissions();
  }

}
