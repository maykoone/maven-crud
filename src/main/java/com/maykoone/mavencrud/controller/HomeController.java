/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maykoone.mavencrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author maykoone
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String home() {
        System.out.println("HomeController: Passing through...");
        return "WEB-INF/views/home.jsp";
    }
}
