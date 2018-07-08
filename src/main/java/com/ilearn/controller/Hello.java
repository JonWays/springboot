/**
 * Author:   Administrator
 * Date:     2018-07-07 下午 11:28
 * Description:
 */
package com.ilearn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello
{
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello()
    {
        return "Hellp SpringBoot!";
    }
}
