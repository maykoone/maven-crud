/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maykoone.mavencrud.dao;

import com.maykoone.mavencrud.entidade.Contato;
import java.util.List;

/**
 *
 * @author maykoone
 */
public interface ContatoDao {

    Contato save(Contato contato);

    void remove(Contato contato);

    Contato findById(Long id);

    List<Contato> findAll();
}
