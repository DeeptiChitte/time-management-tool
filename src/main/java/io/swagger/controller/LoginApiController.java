package io.swagger.controller;

import io.swagger.api.LoginApi;
import io.swagger.model.CredentialModel;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-08-16T02:49:07.097Z")

@Controller
public class LoginApiController implements LoginApi {

    private static final Logger log = LoggerFactory.getLogger(LoginApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    String username = "johnny123";
    String password = "pw456";

    @org.springframework.beans.factory.annotation.Autowired
    public LoginApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<String> loginPost(@ApiParam(value = "Username and password." ,required=true )  @Valid @RequestBody CredentialModel body) {
        HttpStatus httpStatus = HttpStatus.OK;
        boolean isValidCredential = false;
        if(body.getUsername().equals(username) && body.getPassword().equals(password)) {
            isValidCredential = true;
        }
        if(!isValidCredential) {
            httpStatus = HttpStatus.UNAUTHORIZED;
        }
        return new ResponseEntity<String>(httpStatus);
    }

}
