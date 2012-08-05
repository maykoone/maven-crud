/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maykoone.mavencrud.service;

import com.maykoone.mavencrud.dao.ContatoDao;
import com.maykoone.mavencrud.entidade.Contato;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ContatoServiceImpl implements ContatoService {

    private ContatoDao contatoDao;

    public void setContatoDao(ContatoDao contatoDao) {
        this.contatoDao = contatoDao;
    }

    @Override
    public Contato save(Contato contato) {
        return contatoDao.save(contato);
    }

    @Override
    public void remove(Contato contato) {
        contatoDao.remove(contato);
    }

    @Override
    public Contato findById(Long id) {
        return contatoDao.findById(id);
    }

    @Override
    public List<Contato> list() {
        return contatoDao.findAll();
    }
}
