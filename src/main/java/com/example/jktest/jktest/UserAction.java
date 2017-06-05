/******************************************************************
 * UserAction.java
 * Copyright 2017 by GNNT Company. All Rights Reserved.
 * CreateDate：2017/6/5
 * Author：xueph
 * Version：1.0.0
 ******************************************************************/
package com.example.jktest.jktest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <b>修改记录：</b>
 * <p>
 * <li>
 * ----  xueph 2017/6/5
 * </li>
 * </p>
 * <b>类说明：</b>
 * <p>
 * </p>
 */
@Controller
@RequestMapping("/user")
public class UserAction {
    private final Logger log = Logger.getLogger(this.getClass());
    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello() {
        log.info("entry sayHello method....");
        log.info("test gradle build.......");
        return "hello jk_user!";
    }
}
