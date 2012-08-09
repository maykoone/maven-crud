/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maykoone.mavencrud.service;

import com.maykoone.mavencrud.entidade.Contato;
import com.maykoone.mavencrud.repositories.ContatoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ContatoServiceImpl implements ContatoService {

//    private ContatoDao contatoDao;
    @Autowired
    private ContatoRepository contatoRepository;

    public void setContatoDao(ContatoRepository contatoDao) {
        this.contatoRepository = contatoDao;
    }

    @Override
    public Contato save(Contato contato) {
        return contatoRepository.save(contato);
    }

    @Override
    public void remove(Contato contato) {
        contatoRepository.delete(contato);
    }

    @Override
    public Contato findById(Long id) {
        return contatoRepository.findOne(id);
    }

    @Override
    public List<Contato> list() {
        return contatoRepository.findAll();
    }

    @Override
    public Contato findByNome(String nome) {
        return contatoRepository.findByNome(nome);
    }
}
