package guru.springframework.services;

import guru.springframework.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner finByLastName(String lastName);

}
