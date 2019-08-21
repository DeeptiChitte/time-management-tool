package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserModel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-08-16T02:49:07.097Z")
@Entity
@Table(name = "users")
public class UserModel   {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  private Long id;

  @OneToOne
  @JoinColumn(name = "credential_id")
  private CredentialModel credentialModel;

  @JsonProperty("firstName")
  @Column(name="first_name")
  private String firstName = null;

  @JsonProperty("lastName")
  @Column(name="last_name")
  private String lastName = null;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public CredentialModel getCredentialModel() {
    return credentialModel;
  }

  public void setCredentialModel(CredentialModel credentialModel) {
    this.credentialModel = credentialModel;
  }
}

