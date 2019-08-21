package io.swagger.repository;

import io.swagger.model.CredentialModel;
import io.swagger.model.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CredentialRepository extends CrudRepository<CredentialModel, Long> {

}
