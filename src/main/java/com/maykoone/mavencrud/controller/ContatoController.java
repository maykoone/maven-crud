/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maykoone.mavencrud.controller;

import com.maykoone.mavencrud.entidade.Contato;
import com.maykoone.mavencrud.service.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author maykoone
 */
@Controller
@RequestMapping("/contato")
public class ContatoController {

    @Autowired
    private ContatoService service;

    public ContatoController() {
//        service = (ContatoService) new ClassPathXmlApplicationContext(
//                "classpath:META-INF/application-context.xml").getBean("contatoService");
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView list() {
        return new ModelAndView("contato/list", "contatoList", service.list());
    }

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public ModelAndView create() {
        return new ModelAndView("contato/create", "contato", new Contato());
    }

    @RequestMapping( method = RequestMethod.POST)
    public String save(Contato contato) {
        service.save(contato);
        return "redirect:/contato";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ModelAndView show(@PathVariable Long id) {
        Contato contato = service.findById(id);
        return new ModelAndView("contato/show", "contato", contato);
    }

    @RequestMapping(value = "/{id}/form", method = RequestMethod.GET)
    public ModelAndView edit(@PathVariable Long id) {
        Contato contato = service.findById(id);
        return new ModelAndView("contato/edit", "contato", contato);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String update(Contato contato) {
        service.save(contato);
        return "redirect:/contato";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable Long id) {
        service.remove(service.findById(id));
        return "redirect:/contato";
    }
}
