package com;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@RequestScoped
@Named
public class HelloBean {

    public String sayHello() throws Exception {
        return "Hello";
    }

    public String emptyViewAction() {
        return null;
    }
}
