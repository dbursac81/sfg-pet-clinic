package guru.springframework.services;

import guru.springframework.model.Owner;
import java.util.Set;

public interface OwnerService {

    Owner finByLastName(String lastName);
    Owner findById(long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
