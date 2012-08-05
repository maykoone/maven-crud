/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maykoone.mavencrud.dao;

import com.maykoone.mavencrud.entidade.Contato;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class ContatoDaoImpl extends Dao<Contato> implements ContatoDao {

    @PersistenceContext
    private EntityManager entityManager;

    public ContatoDaoImpl() {
        super(Contato.class);
    }

    @Override
    public EntityManager getEntityManager() {
        return entityManager;
    }
}
