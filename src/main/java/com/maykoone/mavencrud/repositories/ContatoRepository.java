/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maykoone.mavencrud.repositories;

import com.maykoone.mavencrud.entidade.Contato;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author maykoone
 */
//@Transactional(readOnly = true)
public interface ContatoRepository extends CrudRepository<Contato, Long> {
    
    @Override
    List<Contato> findAll();
    
    Contato findByNome(String nome);
}
