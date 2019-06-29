package com.huawei.servicecomb.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-06-29T08:19:53.497Z")

@RestSchema(schemaId = "projectivb0")
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON)
public class Projectivb0Impl {

    @Autowired
    private Projectivb0Delegate userProjectivb0Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjectivb0Delegate.helloworld(name);
    }

}
