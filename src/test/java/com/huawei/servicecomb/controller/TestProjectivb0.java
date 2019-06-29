package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjectivb0 {

        Projectivb0Delegate projectivb0Delegate = new Projectivb0Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projectivb0Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}